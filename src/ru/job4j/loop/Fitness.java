package ru.job4j.loop;

public class Fitness {
    public static int calc(int first, int second) {
        int month = 0;
        while (first <= second) {
            month++;
            first *= 3;
            second *= 2;
        }
        return month;
    }
}
