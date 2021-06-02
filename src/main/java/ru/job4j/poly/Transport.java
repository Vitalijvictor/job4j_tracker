package ru.job4j.poly;

public interface Transport {
    String drive();

    int passengers(int quantity);

    int refueling(int fuelQuantity);

}
