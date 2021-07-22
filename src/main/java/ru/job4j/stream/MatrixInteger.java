package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.apache.commons.beanutils.ConvertUtils.convert;

public class MatrixInteger {
    public static List<Integer>  matrixToList(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}
