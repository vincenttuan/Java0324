package com.study.d08;

class A {
    A() {
        this(7);
        System.out.println("A");
    }
    A(int x) {
        System.out.println("A-" + x);
    }
}
class B extends A {
    B() {
        this(7);
        System.out.println("B");
    }
    B(int y) {
        super(y);
        System.out.println("B-" + y);
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        new B(7);
    }
}
