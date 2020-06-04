package com.study.d21;

public class Dog implements Runnable {
    private Cookies cookies;

    public Dog(Cookies cookies) {
        this.cookies = cookies;
    }
    
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            cookies.eat(i);
        }
    }
    
}
