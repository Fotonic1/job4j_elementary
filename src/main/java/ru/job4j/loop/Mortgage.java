package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double amountNew = amount;
        while (amountNew > 0) {
            year++;
            amountNew = amountNew + (amountNew * percent / 100);
            amountNew -= salary;
        }
        return year;
    }
}
