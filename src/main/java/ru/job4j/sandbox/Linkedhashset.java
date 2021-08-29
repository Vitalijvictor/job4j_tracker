package ru.job4j.sandbox;

import java.util.LinkedHashSet;

/**
 * http://espressocode.top/linkedhashset-in-java-with-examples/
 * LinkedHashSet — это упорядоченная версия HashSet,
 * которая поддерживает двусвязный список для всех элементов. Когда необходимо поддерживать порядок итераций,
 * используется этот класс. При переборе HashSet порядок непредсказуем,
 * а LinkedHashSet позволяет перебирать элементы в том порядке, в котором они были вставлены.
 * При циклическом переходе по LinkedHashSet с использованием итератора элементы будут возвращены в том порядке,
 * в котором они были вставлены.
 */
public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(2);
        linkedHashSet.add(8);
        linkedHashSet.add(3);
        linkedHashSet.add(9);
        linkedHashSet.add(8);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains(2));
        System.out.println(linkedHashSet);

        LinkedHashSet<String> cities = new LinkedHashSet<String>();
        cities.add("Moscow");
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Amsterdam");
        cities.add("London");
        cities.add("Paris");
        System.out.println(cities);
    }
}
