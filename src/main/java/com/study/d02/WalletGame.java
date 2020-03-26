package com.study.d02;

import java.util.Random;
import java.util.Scanner;

public class WalletGame {
    public static void main(String[] args) {
        WalletGame game = new WalletGame();
        Wallet wallet = new Wallet(100);
        game.play(wallet);
    }
    
    void play(Wallet wallet) {
        do {
            System.out.printf("目前你的皮包有 $%d\n", wallet.getMoney());
            Scanner sc = new Scanner(System.in);
            System.out.println("請下注(若輸入0或任意負值則離開程式) ==> ");
            int bet = sc.nextInt(); // 下注金額
            if(bet <= 0) break; // 離開程式
            if(bet > wallet.getMoney()) { // 判斷皮包裡的錢是否則足夠 ?
                System.out.printf("錢不夠, 你的皮包只剩 $%d\n", wallet.getMoney());
                continue;
            }
            int ans = new Random().nextInt(12) + 1; // 1~12 的亂數
            System.out.println("請猜比七大(含) 請輸入:1, 或比七小 請輸入:2 ==> ");
            int guess = sc.nextInt(); // 取得使用者的選擇
            switch(guess) { // 判斷使用者使否猜中 !
                case 1: // 比七大
                    System.out.println("使用者猜比七大");
                    if(ans >= 7) {
                        System.out.printf("電腦數字: %d, 比七大, 恭喜答對了 !\n", ans);
                        wallet.updateMoney(bet); // 增加金額
                    } else {
                        System.out.printf("電腦數字: %d, 比七小, Sorry答錯了 !\n", ans);
                        wallet.updateMoney(bet * -1); // 減少金額
                    }
                    break;
                case 2: // 比七小
                    System.out.println("使用者猜比七小");
                    if(ans < 7) {
                        System.out.printf("電腦數字: %d, 比七小, 恭喜答對了 !\n", ans);
                        wallet.updateMoney(bet); // 增加金額
                    } else {
                        System.out.printf("電腦數字: %d, 比七大, Sorry答錯了 !\n", ans);
                        wallet.updateMoney(bet * -1); // 減少金額
                    }
                    break;
                default:
                    System.out.println("輸入錯誤 !");
                    continue;
            }
            
        } while (true);
        
    }
    
}
