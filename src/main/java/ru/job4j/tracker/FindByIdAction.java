package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

public abstract class FindByIdAction implements Store {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by id";
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Find item by id ====");

        int id = input.askInt(" Enter id: ");
        Item item = store.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
