package com.study.d12;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入任意字串:");
        String str = sc.nextLine();
        // 請利用 Stack 做出字串反轉效果 Ex: Java -> avaJ
        char[] chars = str.toCharArray(); // Java -> {'J', 'a', 'v', 'a'}
        Stack<Character> stack = new Stack<>();
        for(char c : chars) {
            stack.push(c); // 放入資料
        }
        while (!stack.isEmpty()) {            
            char data = stack.pop(); // 取得資料並移除
            System.out.print(data);
        }
    }
}
