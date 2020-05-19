package com.study.d16;

public class TryCatchDemo3 {

    public static void main(String[] args) {
        int x = 500; // 分子
        Integer[] ys = {10, 20, 0, 40, null, 60}; // 分母
        // 請求 x / y 結果, 程式執行完畢要顯示"做完了", 但只要遇到錯誤就結束程式(利用 return;)
        try {
            for (Integer y : ys) {
                System.out.printf("%d / %d = %d\n", x, y, x / y);
            }
        } catch (ArithmeticException | NullPointerException e) { // 使用 | 不可以有繼承關係
            // 結束程式
            return;
            //System.exit(0); // finally 區段不會執行
        } finally {
            System.out.println("做完了");
        }

    }
}
