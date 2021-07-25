package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;

public class DoubleLoop {
    public static void main(String[] args) {
        Suit[] suits = new Suit[4];
        Value[] values = new Value[4];
        Stream.of(suits)
                .flatMap(suit -> Stream.of(values)
                        .map(value -> suit + " " + value))
                .forEach(System.out :: println);
    }
}
