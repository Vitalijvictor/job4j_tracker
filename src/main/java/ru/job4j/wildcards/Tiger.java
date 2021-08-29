package ru.job4j.wildcards;

public class Tiger extends Animal {
    public void roar() {}

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void makeNoise() {
        this.roar();
    }
}
