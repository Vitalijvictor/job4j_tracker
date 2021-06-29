package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ItemSortByNameTest {

    @Test
    public void whenStraight() {
            List<Item> items = Arrays.asList(
                    new Item(4, "ZFix bugs"),
                    new Item(20, "EImpl task"),
                    new Item(100, "AReboot server")
            );
            Collections.sort(items, new ItemSortByNameStraight());

            List<Item> items1 = Arrays.asList(
                    new Item(100, "AReboot server"),
                    new Item(20, "EImpl task"),
                    new Item(4, "ZFix bugs")
            );
            assertEquals(items, items1);
    }

    @Test
    public void whenBackwards() {
        List<Item> items = Arrays.asList(
                new Item(4, "ZFix bugs"),
                new Item(20, "EImpl task"),
                new Item(100, "AReboot server")
        );
        Collections.sort(items, new ItemSortByNameBackwards());

        assertEquals("[Item{id=4, name='ZFix bugs'}, Item{id=20, name='EImpl task'}, Item{id=100, name='AReboot server'}]", items.toString());
    }

    @Test
    public void whenReversedStraight() {
        List<Item> items = Arrays.asList(
                new Item(4, "ZFix bugs"),
                new Item(20, "EImpl task"),
                new Item(100, "AReboot server")
        );
        Collections.sort(items, new ItemSortByNameStraight().reversed());

        assertEquals("[Item{id=4, name='ZFix bugs'}, Item{id=20, name='EImpl task'}, Item{id=100, name='AReboot server'}]", items.toString());
    }
}