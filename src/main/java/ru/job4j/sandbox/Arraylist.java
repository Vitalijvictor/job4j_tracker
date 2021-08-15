package ru.job4j.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add(1); // можно добавлять элементы лююого типа
        names.add("Michel");
        names.add("Ivan");
        names.set(2, "Leny"); // замена Ивана на Leny
        names.add("Jojo");
        names.add("Adrian");
        names.remove(4);  // удаление Adrian
        System.out.println(names);

        /**
         * Чтение данных
         */
        for (int index = 0; index < names.size(); index++) {
            Object value = names.get(index);
            System.out.println(value);
        }
        for (Object value : names) {
            System.out.println(value);
        }

        /**
         * <String> указывает что элементы будут только строковые.
         */
        ArrayList<String> namesString = new ArrayList<String>();

        List<String> list = Arrays.stream(args)
                .filter(s -> s.length() <= 2)
                .collect(Collectors.toList());
        System.out.println(list + " list");
    }
}
