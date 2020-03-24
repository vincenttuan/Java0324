package com.study.d01;

import java.util.stream.DoubleStream;

public class SportScore {
    public static void main(String[] args) {
        DoubleStream scores = getScores();
        System.out.println(scores.average().getAsDouble());
        // 標準差 ? 變異係數 ?
        double avg = getScores().average().getAsDouble();
        double sum1 = getScores().map(s -> Math.pow(s - avg, 2)).sum();
        double sd = Math.sqrt(sum1 / getScores().count());
        System.out.printf("標準差: %.2f\n", sd);
    }
    private static DoubleStream getScores() {
        return DoubleStream.of(5.3, 7.8, 9.0, 10.0, 3.5, 6.7, 9.9);
    }
    
}
