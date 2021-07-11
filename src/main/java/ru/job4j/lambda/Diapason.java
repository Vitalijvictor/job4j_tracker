package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Diapason {
    public static List<Double> diapason(int start, int end,
                             Function<Double, Double> func) {
        if (start > end) {
            throw new RuntimeException("start should be less than end");
        }

        List<Double> list = new ArrayList<>();
        for (double i = start; i < end; i++) {
            list.add(func.apply(i));
        }

        return list;
    }
}
