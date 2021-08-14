package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> d1 = Arrays.asList(o1.split("/"));
        List<String> d2 = Arrays.asList(o2.split("/"));

        if (d1.get(0).equals(d2.get(0))) {
            return o1.compareTo(o2);
        } else {
            return o2.compareTo(o1);
        }
    }
}