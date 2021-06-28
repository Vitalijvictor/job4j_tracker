package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemComparatorBackwards {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList();
        Collections.sort(items, Collections.reverseOrder());
        System.out.println(items);
    }
}
