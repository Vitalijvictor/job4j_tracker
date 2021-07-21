package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void sortedToList() {
        List<Profile> profiles = List.of(
                new Profile("Johan", "Antwerpen", "Statiestraat", 10, 5),
                new Profile("Dirk", "Deurne", "Mollenstraat", 8, 3),
                new Profile("Lola", "Brussel", "Ryckenstraat", 1, 2),
                new Profile("Molly", "Gent", "Bruggestraat", 5, 4)
        );
        List<Address> expectedAddresses = Arrays.asList(
                new Address("Antwerpen", "Statiestraat", 10, 5),
                new Address("Brussel", "Ryckenstraat", 1, 2),
                new Address("Deurne", "Mollenstraat", 8, 3),
                new Address("Gent", "Bruggestraat", 5, 4)
        );

        List<Address> addresses = (new Profiles()).collect(profiles);
        assertThat(addresses, is(expectedAddresses));
    }

    @Test
    public void sortedWithoutDuplicate() {
        List<Profile> profiles = List.of(
                new Profile("Johan", "Antwerpen", "Statiestraat", 10, 5),
                new Profile("Dirk", "Deurne", "Mollenstraat", 8, 3),
                new Profile("Lola", "Brussel", "Ryckenstraat", 1, 2),
                new Profile("Molly", "Gent", "Bruggestraat", 5, 4),
                new Profile("Dirk", "Deurne", "Mollenstraat", 8, 3),
                new Profile("Molly", "Gent", "Bruggestraat", 5, 4)
        );
        List<Address> expectedAddresses = Arrays.asList(
                new Address("Antwerpen", "Statiestraat", 10, 5),
                new Address("Brussel", "Ryckenstraat", 1, 2),
                new Address("Deurne", "Mollenstraat", 8, 3),
                new Address("Gent", "Bruggestraat", 5, 4)
        );

        List<Address> addresses = (new Profiles()).collect(profiles);
        assertThat(addresses, is(expectedAddresses));
    }
}