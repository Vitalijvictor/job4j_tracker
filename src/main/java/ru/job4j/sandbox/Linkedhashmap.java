package ru.job4j.sandbox;

import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Fox", 1);
        linkedHashMap.put("Wolf", 4);
        linkedHashMap.put("Rat", 56);
        linkedHashMap.put("Rabbit", 3);
        linkedHashMap.put("Lion", 89);
        linkedHashMap.put("Fish", 41);
        linkedHashMap.put("Fish", 41);
        linkedHashMap.put("Fish", 12);
        System.out.println(linkedHashMap);
    }
}
