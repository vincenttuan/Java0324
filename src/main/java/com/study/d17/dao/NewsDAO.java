package com.study.d17.dao;

import java.net.URL;
import java.util.Scanner;
import org.apache.commons.lang.StringEscapeUtils;

public class NewsDAO {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://oldpaper.g0v.ronny.tw/index/json");
        String json = new Scanner(url.openStream()).useDelimiter("\\A").next();
        json = StringEscapeUtils.unescapeJava(json);
        System.out.println(json);
        
    }
}
