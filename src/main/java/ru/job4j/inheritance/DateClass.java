package ru.job4j.inheritance;

import java.time.LocalDateTime;

class DateClass {
    private String date = LocalDateTime.now().toString();

    public String getTimeString() {
        return date;
    }

    public void setTimeString(String x) {
        this.date = x;
    }
}
