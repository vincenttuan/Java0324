package com.study.d20;

// 帳戶
class Account {
    private int balance; // 帳戶餘額

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }    
    
    // 提款
    public void withdraw(int money) {
        String who = Thread.currentThread().getName();
        System.out.printf("%s 開始提款\n", who);
        int current_balance = getBalance(); // 取得目前的帳戶餘額
        System.out.printf("%s 看到目前的帳戶餘額是: $%d\n", who, current_balance);
        // 進行提款之行為
        if(current_balance >= money) {
            // 帳戶餘額扣款
            setBalance(current_balance - money);
            // 提款成功
            System.out.printf("%s 提款 $%d 成功, 帳戶餘額 $%d\n", who, money, getBalance());
        } else {
            // 提款失敗
            System.out.printf("%s 提款 $%d 失敗, 帳戶餘額 $%d\n", who, money, getBalance());
        }
    }
}

class Withdraw implements Runnable { // 提款行為
    private Account account;
    private int money;

    public Withdraw(Account account, int money) {
        this.account = account;
        this.money = money;
    }
    
    @Override
    public void run() {
        account.withdraw(money); // 對該帳戶進行提款動作
    }

}

public class ATM {
    
}
