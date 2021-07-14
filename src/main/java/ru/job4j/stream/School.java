package ru.job4j.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
    public List<Student> collect(List<Student> students,
                                 Predicate<Student> predict) {

        Stream<Student> studentStream = students.stream();
        return studentStream.filter(predict).collect(Collectors.toList());
    }
}
