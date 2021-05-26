package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String full_name;
    private String faculty;
    private Date receipt_date;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getReceipt_date() {
        return receipt_date;
    }

    public void setReceipt_date(int receipt_date) {
        this.receipt_date = receipt_date;
    }
}
