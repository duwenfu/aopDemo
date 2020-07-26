package com.example.demo.test3;

/**
 * @author duwen.fu
 * @date 2020/7/26 21:27
 * @version 1.0
 */
public aspect Audience {

    private Worker worker;

    public Audience(){}

    //通过setter方法注入
    public void setWorker(Worker worker){
        this.worker = worker;
        System.out.println("工作人员已入场");
    }

    //定义piano构造器切点和后置通知
    pointcut piano():execution(concert.PianoPerform.new());
    after():piano(){
        worker.sendMsg("钢琴");
    }

    //定义violin构造器切点和后置通知
    pointcut violin():execution(concert.ViolinPerform.new());
    after():violin(){
        worker.sendMsg("小提琴");
    }

    //定义不带参数方法切点和前置通知
    pointcut perform():execution(* concert.Performance.perform());
    before():perform(){
        worker.take();
    }

    //定义带两个参数的切点和后置通知
    pointcut finishPerform(String performer, String title):execution(* concert.Performance.finishPerform(String, String)) && args(performer, title);
    after(String performer, String title):finishPerform(performer, title){
        worker.broadcast(performer, title);
    }
}
