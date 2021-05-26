package ru.job4j.profession;

public class Doctor extends Profession {
    private String recipe;
    private String diagnose;

    public Doctor(String name, String surname, String education, int birthday, String recipe, String diagnose) {
        super(name, surname, education, birthday);
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
