package ru.job4j.ex;

public class JdbcConfig {
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
        /*load jdbc*/
    }
    //Конструкция throws UserInputException.
    /*public static void main(String[] args) throws UserInputException {
        load("jdbc://localhost:8080");
    }*/

    //Конструкция try-catch.
    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}