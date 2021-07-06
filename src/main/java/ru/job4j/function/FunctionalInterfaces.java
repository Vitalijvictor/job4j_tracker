package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon =
                (s, s1) -> System.out.println(s + s1);
        biCon.accept(map.get(0), map.get());
        /*
            Замените вставку элементов в карту на использование BiConsumer, он уже объявлен, требуется его реализовать.
         */
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        BiPredicate<Integer, String> biPred =
                (i, s) -> s.contains(i.toString());
        for (Integer i : map.keySet()) {
            /*
                Замените проверку в if() на использование BiPredicate, он объявлен выше, требуется его реализовать.
             */

        }
        /*
            Заменить создание ArrayList из значений Map на Supplier, объявлен ниже, требуется его реализовать.
         */
        Supplier<List<String>> sup = () -> new HashMap<Supplier>(map);
        List<String> strings = new ArrayList<>(map.values());

        Consumer<String> con = (Consumer<String>) sup.get();
        Function<String, String> func = (s, s1) ->
                con.accept(sup.get());
        for (String s : strings) {
            /*
                Заменить вывод строк на применение Consumer
                Заменить преобразование строк к строкам в верхнем регистре с помощью Function
                Необходимое объявлено выше, требуется их реализовать.
            */
            System.out.println(s.toUpperCase());
        }
    }
}