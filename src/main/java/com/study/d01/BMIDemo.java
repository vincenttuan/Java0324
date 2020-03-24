package com.study.d01;

public class BMIDemo {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name="John"; b1.h = 170; b1.w=60;
        BMI b2 = new BMI();
        b2.name="Tom"; b2.h = 180; b2.w=52;
        BMI b3 = new BMI();
        b3.name="Mary"; b3.h = 150; b3.w=70;
        
        System.out.printf("%s: %.2f %s: %.2f %s: %.2f\n", 
                b1.name, b1.getBMI(), b2.name, b2.getBMI(), b3.name, b3.getBMI());
    }
}
