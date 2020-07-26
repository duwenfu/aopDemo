package com.example.demo.test3;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 21:26
 */
public class ViolinPerform implements Performance{
    public ViolinPerform(){
        System.out.println("有请小提琴表演");
    }

    @Override
    public void perform() {
        System.out.println("小提琴表演开始");
    }

    @Override
    public void finishPerform(String performer, String title){
        System.out.println(performer + "演奏了小提琴曲：" + title);
    }
}
