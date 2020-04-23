package com.study.d09.pet;

public class EDog implements Dog {

    @Override
    public void eat() {
        System.out.println("吃電");
    }

    @Override
    public void skill() {
        System.out.println("打發時間");
    }
    
}
