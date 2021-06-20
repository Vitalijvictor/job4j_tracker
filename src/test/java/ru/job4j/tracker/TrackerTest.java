package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

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

        List<Item> allItems = tracker.findAll();
        assertEquals(2, allItems.size());
        assertEquals("test1", allItems.get(0).getName());

        assertEquals(1, allItems.get(0).getId());
        assertEquals(2, allItems.get(1).getId());
    }

    @Test
    public void testIndexOfExisting() {
        Tracker tracker = new Tracker();

        Item item = new Item();
        item.setName("test1");
        tracker.add(item);

        assertEquals(item, tracker.findById(1));
        assertNull(tracker.findById(2));

    }

    @Test
    public void whenReplaceMy() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}