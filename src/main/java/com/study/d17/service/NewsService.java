package com.study.d17.service;

import com.study.d17.dao.NewsDAO;
import com.study.d17.entity.Data;

public class NewsService {
    private NewsDAO dao = new NewsDAO();
    
    public Data getNews(String date) {
        return dao.getDataByDate(date);
    }
}
