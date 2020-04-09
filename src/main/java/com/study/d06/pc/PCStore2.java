package com.study.d06.pc;

public class PCStore2 {
    public static void main(String[] args) {
        Computer computer1 = new Computer(
                new CPU(2000, 8000), 
                new Memory(32, 3000), 
                new HardDriver(1000, 5000)
        );
        Computer computer2 = new Computer(
                new CPU(2500, 9000), 
                new Memory(16, 2500), 
                new HardDriver(500, 2000)
        );
        Computer computer3 = new Computer(
                new CPU(3000, 16000), 
                new Memory(64, 8000), 
                new HardDriver(2000, 15000)
        );
        
        //System.out.printf("一台配備有:\n%s\n價格 $%,d\n",
        //        computer, computer.getPrice());
    }
}
