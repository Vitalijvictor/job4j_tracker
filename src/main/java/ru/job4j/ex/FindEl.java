package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        /* цикл fori, поскольку нам надо найти индекс искомого элемента в массиве */
        for (String i : value) {
            value[Integer.parseInt(i)] = value[Integer.parseInt(key)];
        }
        if (value[Integer.parseInt(key)] == null) {
            throw new ElementNotFoundException("There is no element");
        } else {
            return rsl;
        }
    }

    public static void main(String[] args) {
        try {
            indexOf();
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
