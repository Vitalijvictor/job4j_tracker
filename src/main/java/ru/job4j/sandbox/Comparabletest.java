package ru.job4j.sandbox;

import ru.job4j.collection.Job;

import java.util.*;
import java.util.List;

public class Comparabletest {
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

        List<Integer> reverse = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(reverse);
        Collections.sort(reverse, Collections.reverseOrder());
        System.out.println(reverse);

        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(System.lineSeparator());
        System.out.println("numbers");
        System.out.println(numbers);
    }
}
