package com.study.d20;

import java.util.concurrent.Callable;
// 放置天氣的資料物件
class Weather {
    public double temp; // 溫度
    public double feelsLike; // 體感溫度
    public double humidity; // 濕度
    public String description; // 天氣描述
}
// 取得天氣資料的執行緒工作
class WeatherCallable implements Callable<Weather> {
    private String city;
    private String urlstring = "https://api.openweathermap.org/data/2.5/weather?q=%s,tw&appid=fcc57465b76d35357c84e4e30fe2431a";
    public WeatherCallable(String city) {
        this.city = city;
        urlstring = String.format(urlstring, city);
    }
    @Override
    public Weather call() throws Exception {
        return null;
    }
    
}

public class OpenWeatherDemo {
    
}
