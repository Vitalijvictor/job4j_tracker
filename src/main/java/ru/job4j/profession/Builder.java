package ru.job4j.profession;

public class Builder extends Engineer {
    private String material;
    private int estimate;

    public Builder(String name, String surname, String education, int birthday, String development, String tester, String material, int estimate) {
        super(name, surname, education, birthday, development, tester);
        this.material = material;
        this.estimate = estimate;
    }

    public int renovation(){
        return 0;
    }

}
