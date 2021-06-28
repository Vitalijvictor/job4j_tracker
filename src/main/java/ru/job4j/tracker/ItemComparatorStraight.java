package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ItemComparatorStraight {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList();
        Collections.sort(items, new ItemSortByName());
        System.out.println(items);

    }
}
