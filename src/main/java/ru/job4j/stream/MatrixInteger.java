package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.apache.commons.beanutils.ConvertUtils.convert;

public class MatrixInteger {
    public List<Integer>  mina(Integer[][] matrix) {
        return Arrays.asList(matrix)
                .stream()
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.toList());
    }
}
