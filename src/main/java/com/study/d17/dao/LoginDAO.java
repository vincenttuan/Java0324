package com.study.d17.dao;

import com.google.gson.Gson;
import com.study.d17.entity.Member;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDAO {
    private static Member[] members;
    static {
        try {
            File file = new File("src\\main\\java\\com\\study\\d17\\db\\member.json");
            String json = new Scanner(file).useDelimiter("\\A").next();
            members = new Gson().fromJson(json, Member[].class);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
    public Member[] getMembers() {
        return members;
    }
}
