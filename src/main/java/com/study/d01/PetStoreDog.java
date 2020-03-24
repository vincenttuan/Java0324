package com.study.d01;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class PetStoreDog {
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
        dog1.skill();
        System.out.printf("我有一隻 %s 色的 %s 價格是 %,d\n", dog2.color, dog2.name, dog2.price);
        dog2.skill();
        
        // 分析 Java 7 (命令式)
        Dog[] dogs = {dog1, dog2};
        int sum = 0;
        for(int i=0;i<dogs.length;i++) {
            System.out.printf("%s 價格 %,d\n", dogs[i].name, dogs[i].price);
            sum += dogs[i].price;
        }
        System.out.printf("總價: %,d  均價: %,d\n", sum, sum/dogs.length);
        System.out.println("Java 8 -------------------------------------------");
        // 分析 Java 8 (聲明式)
        // 建立串流 stream
        // 分析串流資料
        // 利用 forEach 印出所有資料
        Stream.of(dogs)
                .filter(d -> d.price < 40000)
                .forEach(d -> System.out.printf("%s 價格 %,d\n", d.name, d.price));
        // 統計數據
        IntSummaryStatistics stat = Stream.of(dogs)
                .mapToInt(d -> d.price)
                .summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getAverage());
    }
}
