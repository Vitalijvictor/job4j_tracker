package ru.job4j.tracker;

public class Dentist extends Doctor {
    public Dentist(String recipe, String diagnose) {
        super(recipe, diagnose);
    }

    public int painRelieverQuantity(){
        return 0;
    }
}
