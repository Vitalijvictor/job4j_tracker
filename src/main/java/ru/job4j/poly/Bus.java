package ru.job4j.poly;

public class Bus implements Transport {
    private int passengersQuantity;
    
    @Override
    public void drive() {
        System.out.println("Bus drives with " + passengersQuantity + ".");
    }

    @Override
    public void passengers(int quantity) {
        this.passengersQuantity = quantity;
    }

    @Override
    public int refueling(int fuelQuantity) {
       return  50 * fuelQuantity;

    }
}
