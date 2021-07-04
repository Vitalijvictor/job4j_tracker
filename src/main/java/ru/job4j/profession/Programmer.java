package ru.job4j.profession;

public class Programmer extends Engineer {
    private int coffeeLiters;
    private int wtfMomentsPerDay;

    public Programmer(String name, String surname, String education,
                      int birthday, String development, int coffeeLiters, int wtfMomentsPerDay) {
        super(name, surname, education, birthday, development);
        this.coffeeLiters = coffeeLiters;
        this.wtfMomentsPerDay = wtfMomentsPerDay;
    }
    
    public int orderDev() {
        return 0;
    }

}
