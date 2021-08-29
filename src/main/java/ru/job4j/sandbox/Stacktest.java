package ru.job4j.sandbox;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

/**
 * https://hr-vector.com/java/klass-stack
 * Класс Stack в Java — это структура данных, которая следует за LIFO (Last In First Out).
 * Java Stack Class подпадает под базовую платформу Collection Hierarchy Framework,
 * в которой вы можете выполнять базовые операции, такие как push, pop и т. д.
 */
public class Stacktest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        /**
         * Перебор стека с использованием listIterator() сверху вниз
         */
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(value);
        }

        ListIterator<String> listIterator = stack.listIterator(stack.size());
        System.out.println("Iterate over a Stack using listIterator() from Top to Bottom:");
        while (listIterator.hasPrevious()) {
            String str = listIterator.previous();
            System.out.println(str);
        }
    }
}

