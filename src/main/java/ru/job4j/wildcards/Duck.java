package ru.job4j.wildcards;

public class Duck extends Animal {
    public void fly() {}

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
        System.out.println("Quack");
    }
}
