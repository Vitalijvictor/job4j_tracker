package ru.job4j.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnimalWildcards {

    public static void iterateWildAnimals(Collection<? extends Animal> animals) {

        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }

    public static void iterateAnimals(Collection<Animal> animals) {

        for (Animal animal: animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        List<Animal> list1 = new ArrayList<>();
        List<Tiger> list2 = new ArrayList<>();
        List<Duck> list3 = new ArrayList<>();

        Tiger tiger = new Tiger();
        Duck duck = new Duck();

        list1.add(tiger);
        list1.add(duck);

        list2.add(tiger);
        list2.add(new Tiger());

        list3.add(duck);

        iterateWildAnimals(list1);
        iterateWildAnimals(list2);
        iterateWildAnimals(list3);

        iterateWildAnimals(list2);
        iterateWildAnimals(list3);
    }
}
