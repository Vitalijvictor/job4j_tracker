package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /*
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combineName =
                (person) ->  person.getName().toLowerCase().contains(key);
        Predicate<Person> combineSurname =
                        (person) ->  person.getSurname().toLowerCase().contains(key);
        Predicate<Person> combineGetPhone =
                                    (person) -> person.getPhone().toLowerCase().contains(key);
        Predicate<Person> combineGetAddress =
                (person) -> person.getAddress().toLowerCase().contains(key);
        Predicate<Person> combine =
                (combineName.or(combineSurname).or(combineGetPhone).or(combineGetAddress));

        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}