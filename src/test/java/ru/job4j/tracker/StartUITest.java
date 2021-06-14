package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StartUITest {
    public void whenExitAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
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
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction(output)
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output output = new StubOutput();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(output),
                new ExitAction(output)
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Output output = new StubOutput();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction(output)
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindAllAction() {
        Tracker tracker = new Tracker();
        Output output = new StubOutput();
        Item item1 = tracker.add(new Item("First item"));
        Item item2 = tracker.add(new Item("Second item"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
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
        Tracker tracker = new Tracker();
        Output output = new StubOutput();
        Item item1 = tracker.add(new Item("First item"));
        Input in = new StubInput(
                new String[] {"0", "First item", "1"}
        );
        UserAction[] actions = {
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
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
        Tracker tracker = new Tracker();
        Output output = new StubOutput();
        Item item1 = tracker.add(new Item("First item"));
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
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
        Tracker tracker = new Tracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
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


