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

    static Builder {
        private String manufacturer;
        private String brand;
        private String model;
        private int identificationNumber;
        private double wingspan;
        private boolean readyToFly;
        private int countOfFlights;
    }

        Builder BuildManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        Builder BuildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder BuildModel(String model) {
            this.model = model;
            return this;
        }

        Builder BuildIdentificationNumber(int identificationNumber) {
            this.identificationNumber = identificationNumber;
            return this;
        }

        Builder BuildWingspan(double wingspan) {
            this.wingspan = wingspan;
            return this;
        }

        Builder BuildReadyToFly(boolean readyToFly) {
            this.readyToFly = readyToFly;
            return this;
        }

        Builder BuildCountOfFlights(int countOfFlights) {
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

            public static void main(String[] args) {
                Jet jet = new Builder().jetBuildManufacturer("The Boeing Company")
                        .jetBuildBrand("Boeing")
                        .jetBuildModel("B707")
                        .jetBuildIdentificationNumber(5411155)
                        .jetBuildWingspan(28.456)
                        .jetBuildReadyToFly(true)
                        .jetBuildCountOfFlights(1452)
                        .jetBuild
                        .build;
            }
     }
}


