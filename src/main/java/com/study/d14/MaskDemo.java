package com.study.d14;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.Scanner;

public class MaskDemo {
    public static void main(String[] args) throws Exception {
        String path = "https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json";
        URL url = new URL(path);
        Scanner sc = new Scanner(url.openStream(), "UTF-8").useDelimiter("\\A");
        String json = sc.next();
        JsonElement je = JsonParser.parseString(json); // 整體 Json 元素
        JsonObject root = je.getAsJsonObject(); // Json 根物件
        JsonArray array = root.getAsJsonArray("features");
        // Java 8
        array.forEach(jo -> {
            jo = jo.getAsJsonObject().get("properties").getAsJsonObject();
            if(jo.getAsJsonObject().get("mask_adult").getAsInt() > 19000) {
                System.out.println(jo);
            }
        });
    }
}
