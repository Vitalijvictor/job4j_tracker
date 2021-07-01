package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String reviews;
    private String whiteHair;

    public Surgeon(String name, String surname, String education, int birthday, String recipe, String diagnose, String reviews, String whiteHair) {
        super(name, surname, education, birthday, recipe, diagnose);
        this.reviews = reviews;
        this.whiteHair = whiteHair;
    }


    public int numberOfSuccessfulOperations() {
        return 0;
    }
}
