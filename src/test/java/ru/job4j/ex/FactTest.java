package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calcFactMinus1To120() {
        int rsl  = 120;
        rsl = Fact.calc(-1);
    }
}