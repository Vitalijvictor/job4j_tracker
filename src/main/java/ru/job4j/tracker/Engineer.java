package ru.job4j.tracker;

public class Engineer extends Profession {
    private String solution;

    public Engineer(String solution) {
        this.solution = solution;
    }

    public String getSolution() {
        return solution;
    }
}
