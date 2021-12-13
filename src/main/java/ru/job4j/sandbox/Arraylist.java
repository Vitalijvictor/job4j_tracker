package ru.job4j.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://javarush.ru/groups/posts/2354-arraylist-v-java
 *ArrayList — реализация изменяемого массива интерфейса List,
 * часть Collection Framework, который отвечает за список (или динамический массив),
 * расположенный в пакете java.utils.
 * Этот класс реализует все необязательные операции со списком
 * и предоставляет методы управления размером массива, который используется для хранения списка.
 *
 * В основе ArrayList лежит идея динамического массива. А именно,
 * возможность добавлять и удалять элементы,
 * при этом будет увеличиваться или уменьшаться по мере необходимости.
 */
public class Arraylist {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add(1);
        names.add("Michel");
        names.add("Ivan");
        names.set(2, "Leny");
        names.add("Jojo");
        names.add("Adrian");
        names.set(1, "Jack");
        names.remove(4);
        System.out.println(names + " names");

        /**
         * Чтение данных
         */
        for (int index = 0; index < names.size(); index++) {
            Object value = names.get(index);
            System.out.println(value + " value loop FOR");
        }
        for (Object value : names) {
            System.out.println(value + " value loop FOREACH");
        }

        /**
         * <String> указывает что элементы будут только строковые.
         */
        ArrayList<String> namesString = new ArrayList<String>();
        namesString.add("Kira");
        namesString.add("Mira");
        namesString.add("Mike");
        namesString.add("Jennifer");
        namesString.add("Kira");
        namesString.add("Sofie");
        System.out.println(namesString + " namesString");
        List<String> list = Arrays.stream(args)
                .filter(s -> s.length() <= 2)
                .collect(Collectors.toList());
        System.out.println(list + " list");

        Beats beats = new Beats("Jojo");
        Beats beats1 = new Beats("Pojo");
        Beats beats2 = new Beats("Russ");
        Beats beats3 = new Beats("Dyna");
        ArrayList<String> arrayBeats = new ArrayList<>();
        arrayBeats.add(beats.getBeats());
        arrayBeats.add(beats1.getBeats());
        arrayBeats.add(beats2.getBeats());
        arrayBeats.add(beats3.getBeats());
        System.out.println(arrayBeats);
    }
}
