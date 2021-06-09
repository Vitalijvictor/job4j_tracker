package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;

        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            } else {
                throw new ElementNotFoundException("there is no any element found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf([1], 1)
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }

}
