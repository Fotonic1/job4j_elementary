package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveName(String nic) {
        this.name = nic;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveName("Gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveName("Black");
        black.show();
    }
}
