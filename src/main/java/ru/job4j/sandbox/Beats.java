package ru.job4j.sandbox;

import java.util.Objects;

public class Beats {
    private String beats;
    private String clock;

    public Beats() {
        this.beats = "beats";
    }

    public Beats(String beats) {
        this.beats = beats;
    }

    public String getBeats() {
        return beats;
    }

    public void setBeats(String beats) {
        this.beats = beats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Beats beats1 = (Beats) o;
        return Objects.equals(beats, beats1.beats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beats);
    }

    @Override
    public String toString() {
        return "Beats{" + "beats='" + beats + '\'' + '}';
    }
}
