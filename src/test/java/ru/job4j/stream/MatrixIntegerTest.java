package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixIntegerTest {
    @Test
    public  void mTOi() {
        Integer[][] matrix = {{1, 5, 6}, {8, 6, 2}};
        List<Integer> expectedList = Arrays.asList(1, 5, 6, 8, 6, 2);
        List<Integer> actual = MatrixInteger.matrixToList(matrix);
        assertThat(expectedList, is(actual));
    }
}