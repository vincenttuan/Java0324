package com.study.d10;

// 部門定義
public class Department { 
    // 員工定義
    class Employee {
        public void job() {
            System.out.println("寫程式");
        }
    }
    // 部門名稱
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
