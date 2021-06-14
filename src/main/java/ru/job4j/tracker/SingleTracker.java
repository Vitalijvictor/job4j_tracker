package ru.job4j.tracker;

import java.util.Arrays;

public final class SingleTracker {

    private static SingleTracker instance = null;

    private Tracker tracker = new Tracker();

    private SingleTracker() {

    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return null;
    }

    public Item[] findByName(String key) {
        return Arrays.copyOf(rsl, counter);
    }
}
