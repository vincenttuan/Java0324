package com.study.d16;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        int x = 500; // 分子
        Integer[] ys = {10, 20, 0, 40, null, 60}; // 分母
        // 請求 x / y 結果
        for(Integer y : ys) {
            // 可能的錯誤是: ArithmeticException, NullPointerException
            try {
                System.out.printf("%d / %d = %d\n", x, y, x/y);
            } catch (ArithmeticException | NullPointerException e) { // 使用 | 不可以有繼承關係
                // 不處理
            } catch (Exception e) {
                // 其他錯誤
            }
            
        }
        
        
    }
}
