package ru.job4j.transport;

public class TransportVariety {
    public static void main(String[] args) {
        Vehicle jet = new Jet();
        Vehicle train = new Train();
        Vehicle autobus = new Autobus();

        Vehicle[] vehicles = new Vehicle[]{jet, train, autobus};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
