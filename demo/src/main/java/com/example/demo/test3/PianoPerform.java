package com.example.demo.test3;

/**
 * @author duwen.fu
 * @version 1.0
 * @date 2020/7/26 21:26
 */
public class PianoPerform implements Performance{
    public PianoPerform(){
        System.out.println("有请钢琴表演");
    }

    @Override
    public void perform() {
        System.out.println("钢琴表演开始");
    }

    @Override
    public void finishPerform(String performer, String title) {
        System.out.println(performer + "演奏钢琴曲：" + title);
    }
}
