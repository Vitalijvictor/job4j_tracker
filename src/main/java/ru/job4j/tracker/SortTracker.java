package ru.job4j.tracker;

import ru.job4j.collection.Job;
import ru.job4j.collection.SortByNameJob;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTracker {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Integer first = 1;
        Integer second = 2;
        int rsl = first.compareTo(second);
        System.out.println(rsl);

        String petr = "Petr";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
        System.out.println(rslStr);

        List<Integer> list1 = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, new SortByNameJob());
        System.out.println(jobs);
    }
}
