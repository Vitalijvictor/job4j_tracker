package ru.job4j.sandbox;

import java.util.HashSet;

/**
 * https://javarush.ru/groups/posts/2147-hashset-v-java
 * Класс HashSet реализует интерфейс Set, основан на хэш-таблице,
 * а также поддерживается с помощью экземпляра HashMap.
 * В HashSet элементы не упорядочены, нет никаких гарантий,
 * что элементы будут в том же порядке спустя какое-то время.
 * Операции добавления, удаления и поиска будут выполняться за константное время при условии,
 * что хэш-функция правильно распределяет элементы по «корзинам»,
 * о чем будет рассказано далее.
 */
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Vital");
        names.add("Michel");
        names.add("Vital");
        names.add("Trump");
        names.add("Adrian");
        names.add("John");
        names.add("Trump");
        names.add("Adrian");
        for (String name : names) {
            System.out.println(name + name.length());
        }
    }

}
