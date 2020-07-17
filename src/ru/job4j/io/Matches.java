package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 11;
        int win = 2;
        System.out.println("Игра начинается!");
        while (true) {
            if (win == 2) {
                win = 1;
            } else {
                win = 2;
            }
            System.out.println("Сколько " + win + " игрок хочет забрать спичек?");
            int a = Integer.valueOf(scanner.nextLine());
            while (a > 0 && a < 4) {
                System.out.println("Вы хотите взять больше спичек чем можно. Попробуйте снова");
                a = Integer.valueOf(scanner.nextLine());
            }
            count -= a;
            if (count <= 0) {
                break;
            }
            System.out.println("Остаток спичек: " + count);
        }
        System.out.println("Спичек не осталось! Выиграл " + win + " игрок");
    }
}
