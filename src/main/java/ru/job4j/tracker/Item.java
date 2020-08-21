package ru.job4j.tracker;

public class Item {
    public String id;
    public String name;

    public Item() {
    }

    public Item(String id) {
        this.id = id;
    }

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
