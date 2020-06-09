package com.study.d22.scheduled;

import java.util.concurrent.Callable;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

// 取得金融商品報價
public class GetPrice2 implements Runnable {
    private String symbol; // 商品代號 : 例如 2330.TW

    public GetPrice2(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public void run() {
        try {
            Stock stock = YahooFinance.get(symbol);
            double price = stock.getQuote().getPrice().doubleValue();
            String name = stock.getName();
            System.out.printf("symbol: %s(%s) price:%.2f\n", symbol, name, price);
        } catch (Exception e) {
            
        }
        
        
    }
    
}
