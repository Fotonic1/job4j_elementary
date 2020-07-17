package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 11;
        int win = 2;
        System.out.println("Игра начинается!");
        while (count > 0) {
            if (win == 2) {
                win = 1;
            } else {
                win = 2;
            }
            System.out.println("Сколько " + win + " игрок хочет забрать спичек?");
            boolean run = true;
            int a = 0;
            while (run) {
                a = Integer.valueOf(scanner.nextLine());
                if (a <= count && a > 0 && a < 4) {
                    run = false;
                } else {
                    System.out.println("Вы хотите взять больше спичек чем есть. Попробуйте снова");
                }
            }
            count -= a;
            System.out.println("Остаток спичек: " + count);
        }
        System.out.println("Спичек не осталось! Выиграл " + win + " игрок");
    }
}
