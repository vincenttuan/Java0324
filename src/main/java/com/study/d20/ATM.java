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
