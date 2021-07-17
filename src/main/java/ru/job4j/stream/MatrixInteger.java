package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.apache.commons.beanutils.ConvertUtils.convert;

public class MatrixInteger {
    public static void main(String[] args) {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> list = Arrays.asList(matrix)
                .stream()
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.toList());
    }
}
