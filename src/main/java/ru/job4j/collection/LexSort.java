package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] l = left.split(".").;
        String[] r = right.split(".");
        int rsl = Integer.compare(l, r);
        return rsl;
    }
}
