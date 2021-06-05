package ru.job4j.poly;

public class Bus implements Transport {
    int passengersQuantity;


    @Override
    public void drive() {

    }

    @Override
    public void passengers(int quantity) {
        this.passengersQuantity = quantity;
    }

    @Override
    public int refueling(int fuelQuantity) {
       int price = 0;
        return price;
    }
}
