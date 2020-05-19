package com.study.d16;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;

public class MemberDemo {
    public static void main(String[] args) {
        try {
            boolean loginCheck = login("john", "12345");
            System.out.println("loginCheck: " + loginCheck);
        } catch (FileNotFoundException ex) {
            System.out.println("檔案找不到");
        } catch (Exception e) {
            System.out.println("登入錯誤訊息: " + e.getMessage());
        }
    }
    public static boolean login(String username, String password) throws FileNotFoundException, Exception {
        File file = new File("src\\main\\java\\com\\study\\d16\\member.json");
        Scanner sc = new Scanner(file).useDelimiter("\\A");
        String json = sc.next();
        JsonArray ja = JsonParser.parseString(json).getAsJsonArray();
        for(int i=0;i<ja.size();i++) {
            JsonObject jo = ja.get(i).getAsJsonObject();
            if(jo.get("username").getAsString().equals(username) && 
                    jo.get("password").getAsString().equals(password)) {
                return true;
            }
        }
        Exception e = new Exception("登入錯誤, 請重新登入 !");
        throw e;
    }
}
