package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Volkov Vladislav Valerevich");
        student.setGroup("FO-91");
        student.setDateBegin("01.09.2009");
        System.out.println(student.getName() + " принят в группу: " + student.getGroup() + " " + student.getDateBegin());
    }
}
