package ru.job4j.sandbox;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://javahelp.online/collections/queue-java
 * Интерфейс Java Queue, java.util.Queue, представляет собой структуру данных,
 * предназначенную для вставки элементов в конец очереди и удаления элементов из начала очереди.
 * Это похоже на работу очереди в супермаркете.
 */
public class Queuetest {
    public static void main(String[] args) {
        Queue queueA = new LinkedList();
        queueA.add("element 1");
        queueA.add("element 2");
        queueA.add("element 3");
        System.out.println(queueA);
        System.out.println(queueA.element());
        System.out.println(queueA.peek());
        System.out.println(queueA.size());
        System.out.println(queueA.hashCode());

        //access via Iterator
        Iterator iterator = queueA.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();

        //access via new for-loop
            for (Object object : queueA) {
                String elementA = (String) object;
                System.out.println(element);
                System.out.println(elementA);
            }
        }
    }
}
