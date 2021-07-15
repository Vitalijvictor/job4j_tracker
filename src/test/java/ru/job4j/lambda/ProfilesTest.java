package ru.job4j.lambda;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ProfilesTest {

    @Test
    public void collectToList() {
        List<Profile> profiles = List.of(
                new Profile("Johan", "Antwerpen", "Statiestraat", 10, 5),
                new Profile("Dirk", "Deurne", "Mollenstraat", 8, 3),
                new Profile("Lola", "Brussel", "Ryckenstraat", 1, 2),
                new Profile("Molly", "Gent", "Bruggestraat", 5, 4)
        );
        profiles.stream().map(x -> x.getAddress()).collect(Collectors.toList());
    }
}