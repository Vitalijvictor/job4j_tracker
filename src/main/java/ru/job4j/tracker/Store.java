package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

import java.util.List;

public interface Store {
    Item add(Item item);

    boolean replace(int id, Item item);

    boolean delete(int id);

    List<Item> findAll();

    List<Item> findByName(String key);

    Item findById(int id);

    String name();

    boolean execute(Input input, Store store);
}