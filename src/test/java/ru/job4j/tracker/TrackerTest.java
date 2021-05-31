package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAll1() {
        Tracker tracker = new Tracker();

        Item item = new Item();
        item.setName("test1");
        tracker.add(item);

        Item item1 = new Item();
        item1.setName("test2");
        tracker.add(item1);

        Item[] allItems = tracker.findAll();
        assertEquals(2, allItems.length);
        assertEquals("test1", allItems[0].getName());

//        for (Item i : allItems)
//            System.out.println(Integer.valueOf(i.getId()) + " : " + i.getName());
    }
}