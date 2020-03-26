package com.study.d02;

public class Wallet {
    private int money; // (封裝 money) 私有變數, 只有 Walllet 自己可以"直接"用

    Wallet() {
    }

    Wallet(int m) { // 建構子
        money = m; // 修改 money 的資料
    }
    
    void setMoney(int m) { // (封裝 money)
        if(m >= 0) {
            money = m;
        } else {
            System.out.println("皮夾的 money 不可 < 0");
        }
    }
    
    void printWallet() {
        System.out.printf("我的皮夾裡有 $%d\n", money);
    }
    
}
