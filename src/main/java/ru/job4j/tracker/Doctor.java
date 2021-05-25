package ru.job4j.tracker;

public class Doctor extends Profession {
    private String recipe;
    private String diagnose;

    public Doctor(String recipe, String diagnose) {
        super();
        this.recipe = recipe;
        this.diagnose = diagnose;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getDiagnose() {
        return diagnose;
    }
}
