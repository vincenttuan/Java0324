package com.study.d19.lab;

class Father extends Thread {
    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗熱水澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話叫瓦斯");
        Worker worker = new Worker();
        worker.start();
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸澡洗完了");
    }
}

class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("瓦斯工人送瓦斯");
        for(int i=1;i<=5;i++) {
            try {
                Thread.sleep(1000);
                System.out.printf("%d 秒鐘 ", i);
            } catch (Exception e) {
            }
        }
        System.out.println("\n瓦斯工人送到了");
    }
}
public class JoinDemo {
    public static void main(String[] args) {
        
    }
}
