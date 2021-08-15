package ru.job4j.sandbox;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add(0, "Petr");
        names.add(0, "Ivan");
        names.add(0, "Stepan");
        for (String value : names) {
            System.out.println(value);
        }
    }
}
