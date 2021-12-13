package ru.job4j.sandbox;

import java.util.Vector;

/**
 * http://espressocode.top/java-util-vector-class-java/
 * Класс Vector реализует растущий массив объектов.
 * Векторы в основном попадают в унаследованные классы,
 * но теперь они полностью совместимы с коллекциями.
 *
 * Vector реализует динамический массив, что означает,
 * что он может увеличиваться или уменьшаться по мере необходимости.
 * Как и массив, он содержит компоненты, к которым можно получить доступ,
 * используя целочисленный индекс
 * Они очень похожи на ArrayList,
 * но Vector синхронизирован и имеет какой-то устаревший метод,
 * который не содержит каркас коллекции.
 * Он расширяет AbstractList и реализует интерфейсы List .
 */
public class Vectortest {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add("geeks");
        vector.add("forGeeks");
        vector.add(3);
        System.out.println("Vector is " + vector);

        Vector vectorindex = new Vector();
        vectorindex.add(0, 2);
        vectorindex.add(1, "geeks");
        vectorindex.add(2, "forGeeks");
        vectorindex.add(3, 3);
        System.out.println("Vector is " + vectorindex);
    }
}

