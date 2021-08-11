package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.reflections.Reflections.collect;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return
                stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .mapToInt(subject -> subject.getScore())
                .average()
                .orElse(0);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {

        //return null;
        return stream
                .map(pupil ->
                        new Tuple(
                                pupil.getName(),
                                pupil.getSubjects().stream()
                                        .mapToInt(s -> s.getScore())
                                        .average()
                                        .orElse(0)
                        )
                )
                .collect(Collectors.toList());
    }

    public static List<Tuple> totalScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(pupil ->
                    new Tuple(
                            pupil.getName(),
                            pupil.getSubjects().stream()
                                    .mapToInt(s -> s.getScore())
                                    .sum()
                            )
                )
                .collect(Collectors.toList());
    }

    public static void averageScoreByPupil(Stream<Pupil> stream) {
        Map<String, Double> map = stream
                .flatMap(pupil -> pupil.getSubjects()
                                .stream())
                                .collect(Collectors.groupingBy(Subject :: getName),
                                Collectors.averagingDouble(Subject :: getScore));
                                return map.entrySet()
                                .stream()
                                .map(x -> new Tuple(x.getKey(), x.getValue())
                                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return totalScoreBySubject(stream)
                        .stream()
                        .max(Comparator.comparing(tuple -> tuple.getScore()))
                        .get();
    }

//    public static Tuple bestSubject(Stream<Pupil> stream) {
//        return averageScoreByPupil()
//                .averagingDouble()
//                .max(Comparator.comparing(Tuple :: getScore))
//                .orElse();
//    }
}
