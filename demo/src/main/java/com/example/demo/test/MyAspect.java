package com.example.demo.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/21 22:49
 */
public class MyAspect implements InvocationHandler {
    private Object instance;

    public Object aspect(Object instance) {
        this.instance = instance;
        return Proxy.newProxyInstance(instance.getClass().getClassLoader(), instance.getClass().getInterfaces(),this);
    }

    public void befor(Method method, Object[] args) {
        System.out.println("~~~~ befor: " + method.getName() + " " + args);
    }

    public void after(Object object) {
        System.out.println("~~~~ after: " + object);
    }

    public static void init() {
        Field[] fields= MyAspect.class.getDeclaredFields();

        for(int i=0;i<fields.length;i++){
            MyAspect myAspect = new MyAspect();
            aspect aspects = fields[i].getType().getAnnotation(aspect.class);
            if(aspects != null) {
//                Java通过反射进行获取实体类中的字段值，当未设置Field的setAccessible方法为true时，会在调用的时候进行访问安全检查，会抛出IllegalAccessException异常
                fields[i].setAccessible(true);
                try {
                    fields[i].set(myAspect, new MyAspect().aspect(fields[i].get(myAspect)));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        befor(method, args);
        result = method.invoke(instance, args);
        after(result);
        return null;
    }

    public static TestAspect testAspect = new TestAspectImpl();
    public static TestAspect testAspectA = new TestAspectImplA();

    public static void main(String []args) {
        init();
        testAspect.test("I'm TestAspectImpl");
        testAspectA.test("I'm TestAspectImplA");
    }
}
