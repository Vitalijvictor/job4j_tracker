package ru.job4j.wildcards;

public class Animal {
    public void run() {
    }

    public void sleep() {
    }

    public void makeNoise() {
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
