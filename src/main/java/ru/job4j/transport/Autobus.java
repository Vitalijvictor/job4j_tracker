package ru.job4j.transport;

public class Autobus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Driving");
    }
}

