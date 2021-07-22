package ru.job4j.lambda;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;
import ru.job4j.stream.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class LearnersTest {
    @Test
    public void learnersToMap() {
        List<Student> students = List.of(
                new Student(70, "Ray"),
                new Student(30, "Billy"),
                new Student(60, "John"),
                new Student(20, "Willy"),
                new Student(70, "Ray"),
                new Student(60, "John"),
                new Student(90, "Jeniffer")
        );

        Map<String, Student> studentsMap = Learners.listToMap(students);
        assertThat(studentsMap, IsMapContaining
                .hasEntry("Billy", new Student(30, "Billy")));
        assertThat(studentsMap, IsMapContaining
                .hasEntry("Willy", new Student(20, "Willy")));
        assertThat(studentsMap, IsMapContaining
                .hasEntry("Ray", new Student(70, "Ray")));
        assertThat(studentsMap, IsMapContaining
                .hasEntry("John", new Student(60, "John")));
        assertThat(studentsMap, IsMapContaining
                .hasEntry("Jeniffer",
                new Student(90, "Jeniffer")));
    }
}