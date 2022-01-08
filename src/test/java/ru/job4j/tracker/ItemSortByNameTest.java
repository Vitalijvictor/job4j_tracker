package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.model.Item;

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

        List<Item> items1 = Arrays.asList(
                new Item(4, "ZFix bugs"),
                new Item(20, "EImpl task"),
                new Item(100, "AReboot server")
        );
        assertEquals(items, items1);
    }

    @Test
    public void whenReversedStraight() {
        List<Item> items = Arrays.asList(
                new Item(4, "ZFix bugs"),
                new Item(20, "EImpl task"),
                new Item(100, "AReboot server")
        );
        Collections.sort(items, new ItemSortByNameStraight().reversed());

        List<Item> items1 = Arrays.asList(
                new Item(4, "ZFix bugs"),
                new Item(20, "EImpl task"),
                new Item(100, "AReboot server")
        );
        assertEquals(items, items1);
    }
}