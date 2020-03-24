package com.study.d01;

public class PetStore {
    public static void main(String[] args) {
        // 我有 2 隻狗
        Dog dog1 = new Dog();
        dog1.color = "白";
        dog1.name = "拉不拉多";
        dog1.price = 30000;
        
        Dog dog2 = new Dog();
        dog2.color = "黃";
        dog2.name = "柴犬";
        dog2.price = 50000;
        
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", dog1.color, dog1.name, dog1.price);
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", dog2.color, dog2.name, dog2.price);
    }
}
