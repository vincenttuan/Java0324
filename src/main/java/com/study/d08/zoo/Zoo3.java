package com.study.d08.zoo;

import java.util.Random;

public class Zoo3 {
    public static void main(String[] args) {
        Animal animal = getRandomAnimal();
        animal.cry();
    }
    
    // 隨機抽一個動物
    public static Animal getRandomAnimal() {
        int n = new Random().nextInt(3); // 0, 1, 2
        switch(n) {
            case 1:
                return new Bird();
            case 2:
                return new Cat();
            default:
                return new Tiger();
        }
    }
}
