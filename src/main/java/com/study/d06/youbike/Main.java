package com.study.d06.youbike;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "https://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=json&limit=400";
        Reader reader = new InputStreamReader(new URL(url).openStream(), "UTF-8");
        JsonElement je = JsonParser.parseReader(reader);
        String json = je.getAsJsonObject().getAsJsonObject("result").getAsJsonArray("records").toString();
        System.out.println(json);
        
    }
}
