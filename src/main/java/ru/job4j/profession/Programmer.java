package ru.job4j.profession;

public class Programmer extends Engineer {
    private int coffeeLiters;
    private int wtfMomentsPerDay;

    public Programmer(String name, String surname, String education, int birthday, String development, String tester, int coffeeLiters, int wtfMomentsPerDay) {
        super(name, surname, education, birthday, development, tester);
        this.coffeeLiters = coffeeLiters;
        this.wtfMomentsPerDay = wtfMomentsPerDay;
    }
    public int orderDev(){
        return 0;
    }

}
