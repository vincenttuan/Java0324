package com.study.d05;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.util.Scanner;

public class MaskDemo5 {
    public static void main(String[] args) throws Exception {
        File file = new File("src\\main\\java\\com\\study\\d05\\mask.json");
        String json = getJson(file);
        //System.out.println(json);
        // 抓取所有資料 name adult child
        JsonElement je = JsonParser.parseString(json); // 整體 Json 元素
        JsonObject root = je.getAsJsonObject(); // Json 根物件
        JsonArray array = root.getAsJsonArray("features");
        int mask_adult_sum = 0;
        int mask_child_sum = 0;
        for(int i=0;i<array.size();i++) {
            JsonObject first = array.get(i).getAsJsonObject();
            JsonObject properties = first.getAsJsonObject("properties");
            int mask_adult = properties.get("mask_adult").getAsInt();
            int mask_child = properties.get("mask_child").getAsInt();
            mask_adult_sum += mask_adult;
            mask_child_sum += mask_child;
        }
        System.out.printf("adult_sum: %,d child_sum: %,d Total: %,d\n", 
                mask_adult_sum, 
                mask_child_sum, 
                (mask_adult_sum + mask_child_sum));
    }
    // 取得 Json 字串
    public static String getJson(File file) throws Exception {
        Scanner sc = new Scanner(file, "UTF-8").useDelimiter("\\A");
        return sc.next();
    }
    
}
