package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (rsl : value) {
            if (rsl == -0){
                throw new ElementNotFoundException("Url could not be null");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf()
        }
        catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}

