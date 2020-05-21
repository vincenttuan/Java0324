package com.study.d17.service;

import com.study.d17.dao.LoginDAO;
import com.study.d17.entity.Member;
import com.study.d17.exception.LoginException;

public class LoginService {
    private LoginDAO dao = new LoginDAO();
    public boolean login(String username, String password) throws LoginException {
        Member[] members = dao.getMembers();
        for(Member m : members) {
            if(m.getUsername().equals(username) && m.getPassword().equals(password)) {
                return true;
            }
        }
        LoginException ex = new LoginException("登入失敗");
        throw ex;
    }
}
