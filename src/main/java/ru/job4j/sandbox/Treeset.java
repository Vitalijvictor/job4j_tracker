package ru.job4j.sandbox;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * http://espressocode.top/treeset-in-java-with-examples/
 * TreeSet реализует интерфейс SortedSet, поэтому повторяющиеся значения не допускаются.
 * Объекты в TreeSet хранятся в отсортированном и возрастающем порядке.
 * TreeSet не сохраняет порядок вставки элементов, но элементы сортируются по ключам.
 * TreeSet не позволяет вставлять гетерогенные объекты.
 * Он выдаст исключение classCastException во время выполнения, если попытается добавить гетерогенные объекты.
 * TreeSet служит отличным выбором для хранения больших объемов отсортированной информации,
 * к которой предполагается быстрый доступ из-за более быстрого доступа и времени поиска.
 * TreeSet — это, по сути, реализация самобалансирующегося бинарного дерева поиска,
 * такого как Red-Black Tree . Поэтому такие операции, как добавление,
 * удаление и поиск, занимают O (Log n) время А такие операции,
 * как печать n элементов в отсортированном порядке, занимают O (n) времени.
 */
public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet<>();
        treeset.add("Zoom");
        treeset.add("Tamboo lamboo");
        treeset.add("Bobby");
        treeset.add("Noise");
        treeset.add("Roni size");
        treeset.add("Massive attack");
        treeset.add("Abstract symmetry");
        treeset.add("Roni size");
        treeset.add("Bobby");
        treeset.add("Noise");

        System.out.println(treeset);
        System.out.println(treeset.iterator());
        System.out.println(treeset.size());
        System.out.println(treeset.first());

        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(System.lineSeparator());
        System.out.println("numbers");
        System.out.println(numbers);
    }
}
