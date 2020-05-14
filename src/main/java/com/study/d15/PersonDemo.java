package com.study.d15;

import java.util.ArrayList;
import java.util.stream.Stream;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("Mary", 20);
        Person p3 = new Person("Helen", 40);
        
        Stream.of(p1, p2, p3).sorted().forEach(System.out::println);
    }
}
