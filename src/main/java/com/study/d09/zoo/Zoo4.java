package com.study.d09.zoo;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Zoo4 {
    public static void main(String[] args) {
        Predicate<Animal> legsMoreThen2 = a -> a.getLegs() >= 2;
        Predicate<Animal> nameMoreThen2 = a -> a.getName().length() >= 2;
        
        int sum = Stream.of(new Bird(), new Lion(), new Fish(), new Ostrich())
                .filter(legsMoreThen2)
                .filter(nameMoreThen2)
                .peek(System.out::println)
                .mapToInt(Animal::getLegs) // a -> a.getLegs()
                .sum();
        System.out.println(">=2 的腳總數= " + sum);
    }
}
