package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.model.Item;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

public class MemTrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        MemTracker memTracker = new MemTracker();
        Item item = new Item();
        item.setName("test1");
        memTracker.add(item);
        Item result = memTracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAll1() {
        MemTracker memTracker = new MemTracker();

        Item item = new Item();
        item.setName("test1");
        memTracker.add(item);

        Item item1 = new Item();
        item1.setName("test2");
        memTracker.add(item1);

        List<Item> allItems = memTracker.findAll();
        assertEquals(2, allItems.size());
        assertEquals("test1", allItems.get(0).getName());

        assertEquals(1, allItems.get(0).getId());
        assertEquals(2, allItems.get(1).getId());
    }

    @Test
    public void testIndexOfExisting() {
        MemTracker memTracker = new MemTracker();

        Item item = new Item();
        item.setName("test1");
        memTracker.add(item);

        assertEquals(item, memTracker.findById(1));
        assertNull(memTracker.findById(2));

    }

    @Test
    public void whenReplaceMy() {
        MemTracker memTracker = new MemTracker();
        Item bug = new Item();
        bug.setName("Bug");
        memTracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        memTracker.replace(id, bugWithDesc);
        assertThat(memTracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        MemTracker memTracker = new MemTracker();
        Item bug = new Item();
        bug.setName("Bug");
        memTracker.add(bug);
        int id = bug.getId();
        memTracker.delete(id);
        assertThat(memTracker.findById(id), is(nullValue()));
    }
}