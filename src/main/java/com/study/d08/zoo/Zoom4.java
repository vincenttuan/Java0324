package com.study.d08.zoo;

public class Zoom4 {
    public static void main(String[] args) {
        Cat cat = new Tiger();
        ((Animal)cat).cry();
        ((Tiger)cat).hunter();
    }
}
