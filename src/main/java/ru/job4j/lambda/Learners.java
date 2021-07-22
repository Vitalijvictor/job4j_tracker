
package ru.job4j.lambda;

import ru.job4j.stream.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Learners {
    public static Map<String, Student> listToMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        s -> s,
                        (s, s1) -> s
                ));
    }
}


