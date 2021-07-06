package ru.job4j.function;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiPredicate<Integer, String> biPred = (integer, s) -> integer % 2 == 0 || s.length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred.test(i, map.get(i))) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        /*
            Заменить создание ArrayList из значений Map на Supplier, объявлен ниже, требуется его реализовать.
         */
        Supplier<List<String>> sup = () -> new HashSet<>(map);
        List<String> strings = new ArrayList<>(map.values());

        Consumer<String> con = con.accept(sup.get());
        Function<String, String> func = (s, s1) ->
                con.accept(func.get());
        for (String s : strings) {
            Consumer<String> consumer = (s) -> System.out.println(s);
            /*
                Заменить вывод строк на применение Consumer
                Заменить преобразование строк к строкам в верхнем регистре с помощью Function
                Необходимое объявлено выше, требуется их реализовать.
            */
            System.out.println(s.toUpperCase());
        }
    }
}