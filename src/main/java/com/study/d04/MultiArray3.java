package com.study.d04;

public class MultiArray3 {
    public static void main(String[] args) {
        int[][] scores = { // 一年甲班的月考成績
                            {100, 50, 95}, // 第1位的分數
                            {90, 75, 40}   // 第2位的分數 
                         };
        print(scores);
        
        // 1.試問列出所有人的平均分數
        
        // 2.試問一年甲班此次的月考的班級平均成績
        
        
    }
    public static void print(int [][] datas) {
        for(int i=0;i<datas.length;i++) {
            for(int k=0;k<datas[i].length;k++) {
                System.out.print(datas[i][k] + ", ");
            }
            System.out.println();
        }
    }
}
