package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(x -> x.getAddress()).collect(Collectors.toList());
    }

}
