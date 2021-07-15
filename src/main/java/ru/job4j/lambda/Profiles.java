package ru.job4j.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(x -> x.getAddress())
                .sorted(
                    new Comparator<Address>() {
                        public int compare(Address city1, Address city2) {
                            return city1.getCity().compareTo(city2.getCity());
                        }
                    }
                )
                .collect(Collectors.toList());
    }
}
