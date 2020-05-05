package com.study.d12;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        IntStream.rangeClosed(1, 10).forEach(list::add); // i -> list.add(i)
        System.out.println(list);
        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
        // 統計資料
        IntSummaryStatistics stats = list.stream().mapToInt(i -> i).summaryStatistics();
        System.out.println(stats);
        System.out.println(stats.getAverage());
    }
}
