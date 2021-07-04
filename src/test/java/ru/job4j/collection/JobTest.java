package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenStraightComparatorByName() {
        Comparator<Job> cmpNamePriority = new JobNameComparatorStraight();
        int rsl = cmpNamePriority.compare(
                new Job("Man", 0),
                new Job("Women", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenStraightComparatorByPriority() {
        Comparator<Job> cmpNamePriority = new JobPriorityComparatorStraight();
        int rsl = cmpNamePriority.compare(
                new Job("Man", 0),
                new Job("Women", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenBackwardsComparatorByName() {
        Comparator<Job> cmpNamePriority = new JobNameComparatorBackwards();
        int rsl = cmpNamePriority.compare(
                new Job("Apex", 1),
                new Job("Clan", 0)
        );
        assertThat(rsl, lessThan(3));
    }

    @Test
    public void whenBackwardsComparatorByPriority() {
        Comparator<Job> cmpNamePriority = new JobNameComparatorBackwards();
        int rsl = cmpNamePriority.compare(
                new Job("Apex", 0),
                new Job("Clan", 1)
        );
        assertThat(rsl, lessThan(3));
    }

    @Test
    public void whenStraightComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobNameComparatorStraight().
                thenComparing(new JobPriorityComparatorStraight());
        int rsl = cmpNamePriority.compare(
                new Job("Apple", 0),
                new Job("Banana", 1)
        );
        assertThat(rsl, lessThan(1));
    }

    @Test
    public void whenBackwardsComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobNameComparatorBackwards().
                thenComparing(new JobPriorityComparatorBackwards());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}