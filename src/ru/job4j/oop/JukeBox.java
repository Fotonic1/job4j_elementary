package ru.job4j.oop;

public class JukeBox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюжи пешеходы по лужа...");
        } else if (position == 2) {
            System.out.println("Тем кто ложиться спать срокойная ночь...");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        JukeBox box = new JukeBox();
        box.music(1);
        box.music(2);
        box.music(3);
    }
}
