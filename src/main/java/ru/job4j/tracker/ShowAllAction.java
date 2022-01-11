package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

import java.util.List;

public class ShowAllAction implements Store {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show All";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Show all items ====");
        List<Item> items = store.findAll();
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Хранилище еще не содержит заявок.");
        }
        return true;
    }
}
