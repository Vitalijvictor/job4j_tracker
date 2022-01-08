package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.model.Item;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenExitAction() {
        Output out = new StubOutput();
        MemTracker memTracker = new MemTracker();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );

        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new ExitAction(out));

        new StartUI(out).init(in, memTracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
        ));
    }

    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();

        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new CreateAction(output));
        actions.add(new ExitAction(output));

        new StartUI().init(in, memTracker, actions);
        assertThat(memTracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        MemTracker memTracker = new MemTracker();
        Output output = new StubOutput();
        Item item = memTracker.add(new Item(1));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );

        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new ReplaceAction(output));
        actions.add(new ExitAction(output));

        new StartUI().init(in, memTracker, actions);
        assertThat(memTracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        MemTracker memTracker = new MemTracker();
        Output output = new StubOutput();
        Item item = memTracker.add(new Item(1));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new DeleteAction(output));
        actions.add(new ExitAction(output));
        new StartUI().init(in, memTracker, actions);
        assertThat(memTracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindAllAction() {
        MemTracker memTracker = new MemTracker();
        Output output = new StubOutput();
        Item item1 = memTracker.add(new Item(1));
        Item item2 = memTracker.add(new Item(2));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new ShowAllAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(in, memTracker, actions);
        String expectedOutput = "Menu." + System.lineSeparator()
                + "0. Show All" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "=== Show all items ====" + System.lineSeparator()
                + item1 + System.lineSeparator()
                + item2 + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Show All" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator();

        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void whenFindByNameAction() {
        MemTracker memTracker = new MemTracker();
        Output output = new StubOutput();
        Item item1 = memTracker.add(new Item(1));
        Input in = new StubInput(
                new String[] {"0", "First item", "1"}
        );
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new FindByNameAction(output));
        actions.add(new ExitAction(output));

        new StartUI(output).init(in, memTracker, actions);
        String expectedOutput = "Menu." + System.lineSeparator()
                + "0. Find by name" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "=== Find items by name ====" + System.lineSeparator()
                + item1 + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find by name" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator();
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void whenFindByIdAction() {
        MemTracker memTracker = new MemTracker();
        Output output = new StubOutput();
        Item item1 = memTracker.add(new Item(1));
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new FindByIdAction(output));
        actions.add(new ExitAction(output));
        new StartUI(output).init(in, memTracker, actions);
        String expectedOutput = "Menu." + System.lineSeparator()
                + "0. Find by id" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator()
                + "=== Find item by id ====" + System.lineSeparator()
                + item1 + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find by id" + System.lineSeparator()
                + "1. Exit" + System.lineSeparator();
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"17", "0"}
        );
        MemTracker memTracker = new MemTracker();
        List<UserAction> actions = new ArrayList<UserAction>();
        actions.add(new ExitAction(out));
        new StartUI(out).init(in, memTracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit" + ln
                )
        );
    }
}


