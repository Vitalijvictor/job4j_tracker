package ru.job4j.tracker;

import org.junit.Test;
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

        Item[] allItems = tracker.findAll();
        assertEquals(2, allItems.length);
        assertEquals("test1", allItems[0].getName());

        assertEquals(1, allItems[0].getId());
        assertEquals(2, allItems[1].getId());

//        for (Item i : allItems)
//            System.out.println(Integer.valueOf(i.getId()) + " : " + i.getName());
    }

    @Test
    public void testIndexOfExisting() {
        Tracker tracker = new Tracker();

        Item item = new Item();
        item.setName("test1");
        tracker.add(item);

        assertEquals(item, tracker.findById(1) );
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
        tracker.replaceMy(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenReplace1() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace1(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenReplace2() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace2(id, bugWithDesc);
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