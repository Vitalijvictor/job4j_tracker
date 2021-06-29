package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int l = Integer.parseInt(left);
        int r = Integer.parseInt(right);
        int rsl = Integer.compare(l, r);
        return rsl;
    }
}
