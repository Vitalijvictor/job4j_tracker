package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> Boolean.parseBoolean(null))
                .sorted((left, right) -> Comparator.comparing(left.getScore(right.getScore())))
                .takeWhile(st -> st > bound)
                .collect(Collectors.toList());
    }
}
