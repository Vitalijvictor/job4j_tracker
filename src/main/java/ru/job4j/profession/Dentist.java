package ru.job4j.profession;

public class Dentist extends Doctor {
    private int teeth;
    private boolean isBoi;

    public Dentist(String name, String surname, String education, int birthday, String recipe, String diagnose, int teeth, boolean isBoi) {
        super(name, surname, education, birthday, recipe, diagnose);
        this.teeth = teeth;
        this.isBoi = isBoi;
    }

    public int painRelieverQuantity(){
        return 0;
    }
}
