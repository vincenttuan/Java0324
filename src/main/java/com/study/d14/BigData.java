package com.study.d14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class BigData {
    private static List<Set<Integer>> lottos;
    static { // static 初始區 (建立 10 萬筆 Lotto 資料)
        lottos = new ArrayList<>();
        for(int i=1;i<=10000;i++) {
            Set<Integer> lotto = new TreeSet<>();
            while (lotto.size() < 6) {
                lotto.add(new Random().nextInt(49) + 1);
            }
            lottos.add(lotto);
        }
    }

    public static void main(String[] args) {
//        lottos.stream()
//                .filter(lotto -> lotto.stream().anyMatch(n -> n == 1))
//                .filter(lotto -> lotto.stream().anyMatch(n -> n == 49))
//                .forEach(System.out::println);
//        System.out.println("---------------------------");
        lottos.stream()
                .parallel()
                .filter(lotto -> lotto.stream().mapToInt(n -> n).sum() == 40)
                .forEach(System.out::println);
    }
}
