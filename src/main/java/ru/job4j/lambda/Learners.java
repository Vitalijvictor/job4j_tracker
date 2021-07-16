package ru.job4j.lambda;

import ru.job4j.stream.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Learners {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(30, "Biily"),
                new Student(20, "Willy"),
                new Student(70, "Ray"),
                new Student(60, "John"),
                new Student(90, "Jeniffer")
        );

        public void tomap(Learners students) {
            System.out.println(
                    List.of(students.stream().distinct().collect(Collectors.toMap(
                            e -> students.getSurname(),
                            e -> students.getScore()
                            )
                    )));
        }
    }
}
