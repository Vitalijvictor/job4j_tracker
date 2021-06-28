package ru.job4j.tracker;

import java.util.Collections;
import java.util.Comparator;

public class ItemSortByNameBackwards extends ItemSortByNameStraight implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return -1 * super.compare(first, second);
    }
}