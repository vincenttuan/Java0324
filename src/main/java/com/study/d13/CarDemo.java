package com.study.d13;

import java.util.Map;
import java.util.TreeMap;

public class CarDemo {
    static Map<Car, Integer> map;
    static {
        Car car1 = new Car("Toyota", 2000, 60_0000);
        Car car2 = new Car("Benz", 3000, 120_0000);
        Car car3 = new Car("BMW", 2500, 220_0000);
        map = new TreeMap<>();
        map.put(car1, 100);
        map.put(car2, 50);
        map.put(car3, 15);
    }
    
    public static void main(String[] args) {
        
    }
}
