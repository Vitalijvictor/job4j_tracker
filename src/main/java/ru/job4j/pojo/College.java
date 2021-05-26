package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student setFull_name("John Stivens");
        student setFaculty("informatica");
        student setReceipt_date(new Date());

        System.out.println(student.getFull_name() + " Are student - " + student.getFaculty() + " faculty ");
    }
}
