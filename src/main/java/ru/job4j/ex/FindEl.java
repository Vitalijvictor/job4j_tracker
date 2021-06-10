package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("there is no any element found");
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"a", "b"}, "a");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

}
