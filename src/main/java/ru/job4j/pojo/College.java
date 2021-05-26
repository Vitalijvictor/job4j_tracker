package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("John Stivens");
        student.setFaculty("computer science");
        student.setReceiptDate(new Date());

        System.out.println(student.getFullName() + " is student of " + student.getFaculty() + " faculty ");
    }
}
