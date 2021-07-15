package ru.job4j.lambda;

public class Profile {
    private String name;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Profile(String name, String city, String street, int home,
                   int apartment) {
        this.name = name;
        this.address = new Address(city, street, home, apartment);
    }
}
