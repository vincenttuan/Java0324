package com.study.d22.single_scheduled;

import java.util.concurrent.Callable;

// 取得金融商品報價
public class GetPrice implements Callable<Double>{
    private String symbol; // 商品代號 : 例如 2330.TW

    public GetPrice(String symbol) {
        this.symbol = symbol;
    }
    
    @Override
    public Double call() throws Exception {
        return 0.0;
    }
    
}
