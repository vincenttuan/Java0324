package com.study.d18;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IWantToSeeMovie {
    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("A班", "A.txt");
        map.put("B班", "B.txt");
        // 哪一班可以看限制級電影 ?
        
    }
    
    public static boolean pass(String key, String value) throws Exception {
        String baseUrl = "src\\main\\java\\com\\study\\d18\\";
        File file = new File(baseUrl + value);
        String data = new Scanner(file).useDelimiter("\\A").next();
        String[] rows = data.split("\n");
        for(String age : rows) {
            Person person = new Person();
            person.setAge(Integer.parseInt(age.trim()));
            if(person.getAge() == -1) {
                return false;
            }
        }
        return true;
    }
}
