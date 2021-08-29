package ru.job4j.sandbox;

import java.util.LinkedList;

/**
 * https://javarush.ru/groups/posts/1938-linkedlist
 * В LinkedList элементы фактически представляют собой звенья одной цепи.
 * У каждого элемента помимо тех данных, которые он хранит,
 * имеется ссылка на предыдущий и следующий элемент.
 * По этим ссылкам можно переходить от одного элемента к другому.
 */
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add(0, "Petr");
        names.add(0, "Ivan");
        names.add(2, "Stephan");
        names.add(1, "Aurel");
        names.add(1, "Aurel");
        names.add(1, "Aurel");
        for (String value : names) {
            System.out.println(value + " value");
        }

        LinkedList<String> nameschain = new LinkedList<String>();
        nameschain.add(0, "I ");
        nameschain.add(1, "want");
        nameschain.add(2, " give");
        nameschain.add(3, " a gift ");
        nameschain.add(4, "to ");
        nameschain.add(5, "you ");
        for (String value : nameschain) {
            System.out.print(value);
        }
    }
}
