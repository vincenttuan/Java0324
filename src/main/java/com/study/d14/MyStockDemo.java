package com.study.d14;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStockDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d14\\BWIBBU_d.csv");
        Scanner sc = new Scanner(file, "UTF-8").useDelimiter("\\A");
        String data = sc.next();
        //System.out.println(data);
        String[] rows = data.split("\n");
        List<MyStock> myStocks = new ArrayList<>();
        for(String row : rows) {
            String[] stock = row.trim().replace("\"", "").split(",");
            if(stock.length == 7 && !stock[0].contains("證券代號")) {
                //System.out.println(stock[0] + " " + stock[1] + " " + stock[2] + " " + stock[3] + " " + stock[4] + " " + stock[5] + " " + stock[6]);
                MyStock myStock = new MyStock(stock[0], stock[1], stock[2], stock[3], stock[4], stock[5], stock[6]);
                myStocks.add(myStock);
            }
        }
        System.out.println(myStocks);
    }
}
