package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Clean code", 350);
        books[1] = new Book("Chipolino", 100);
        books[2] = new Book("Who is who", 500);
        books[3] = new Book("Witcher", 300);
        for (int i = 0; i < books.length; i++) {
            System.out.println("Books " + books[i].getName() + " have " + books[i].getPages() + " pages.");
        }
        System.out.println("Перестовляем книги с 1 на 4");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println("Books " + books[i].getName() + " have " + books[i].getPages() + " pages.");
        }
        System.out.println("Ищем чистый код");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("Books " + books[i].getName() + " have " + books[i].getPages() + " pages.");
            }
        }
    }
}
