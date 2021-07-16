package ru.job4j.lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(x -> x.getAddress())
                .sorted(Comparator.comparing(Address::getCity)
                )
                .distinct()
                .collect(Collectors.toList());
    }
}
