package ru.job4j.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsageInteger {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-36);
        numbers.add(-3);
        numbers.add(-2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> positiveNumbers = numbers.stream().
                filter(i -> i > 0).collect(Collectors.toList());
        positiveNumbers.forEach(System.out::println);

    }
}

