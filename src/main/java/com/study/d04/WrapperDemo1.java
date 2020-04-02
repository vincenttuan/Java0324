package com.study.d04;

public class WrapperDemo1 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        String chinese = "100";
        String english = "90";
        System.out.println(Integer.parseInt(chinese) + Integer.parseInt(english));
    }
}
