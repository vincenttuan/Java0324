package com.study.d17;

import com.study.d17.entity.Data;
import com.study.d17.service.NewsService;
import java.util.List;

public class NewsPage {
    public static void main(String[] args) {
        NewsService service = new NewsService();
        Data data = service.getNews("5/22");
        System.out.println(data.getTitle());
        /*
        for(List<String> list : data.getHeadlines()) {
            list.stream().forEach(System.out::println);
        }
        */
        data.getHeadlines()
                .stream()
                .forEach(list -> list.stream().forEach(System.out::println));
    }
}
