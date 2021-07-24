package ru.job4j.stream;

public class Jet {
    private String manufacturer;
    private String brand;
    private String model;
    private int identificationNumber;
    private double wingspan;
    private boolean readyToFly;
    private int countOfFlights;

    public Jet(String manufacturer, String brand, String model,
               int identificationNumber, int wingspan,
               boolean readyToFly, int numbersOfFlights) {
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.model = model;
        this.identificationNumber = identificationNumber;
        this.wingspan = wingspan;
        this.readyToFly = readyToFly;
        this.countOfFlights = numbersOfFlights;
    }

    @Override
    public String toString() {
        return "Jet{" + "manufacturer='" + manufacturer + '\'' + ", brand='"
                + brand + '\'' + ", model='" + model + '\''
                + ", identificationNumber="
                + identificationNumber + ", wingspan=" + wingspan
                + ", readyToFly="
                + readyToFly + ", countOfFlights=" + countOfFlights + '}';
    }

    static class Builder {
        private String manufacturer;
        private String brand;
        private String model;
        private int identificationNumber;
        private double wingspan;
        private boolean readyToFly;
        private int countOfFlights;
    }

        Builder buildManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildIdentificationNumber(int identificationNumber) {
            this.identificationNumber = identificationNumber;
            return this;
        }

        Builder buildWingspan(double wingspan) {
            this.wingspan = wingspan;
            return this;
        }

        Builder buildReadyToFly(boolean readyToFly) {
            this.readyToFly = readyToFly;
            return this;
        }

        Builder buildCountOfFlights(int countOfFlights) {
            this.countOfFlights = countOfFlights;
            return this;
        }

        Jet build() {
            Jet jet = new Jet();
            jet.manufacturer = manufacturer;
            jet.brand = brand;
            jet.model = model;
            jet.identificationNumber = identificationNumber;
            jet.wingspan = wingspan;
            jet.readyToFly = readyToFly;
            jet.countOfFlights = countOfFlights;
            return jet;
     }

    public static void main(String[] args) {
        Jet jet = new Builder().buildManufacturer("The Boeing Company")
                .buildBrand("Boeing")
                .buildModel("B707")
                .buildIdentificationNumber(5411155)
                .buildWingspan(28.456)
                .buildReadyToFly(true)
                .buildCountOfFlights(1452)
                .build();
        System.out.println(jet);
    }
}


