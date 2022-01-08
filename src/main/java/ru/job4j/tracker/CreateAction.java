package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Create";
    }

    @Override
    public boolean execute(Input input, MemTracker memTracker) {
        out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(1);
        memTracker.add(item);
        return true;
    }
}