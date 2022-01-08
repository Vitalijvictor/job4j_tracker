package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace Item";
    }

    @Override
    public boolean execute(Input input, MemTracker memTracker) {
        out.println("=== Edit item ====");
        int id = input.askInt(" Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(1);
        if (memTracker.replace(id, item)) {
            out.println("Заявка изменена успешно.");
        } else {
            out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
