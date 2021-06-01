package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.job4j.ex.Fact.calc;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calcFact5To120() {
        int rsl  = 120;
        rsl = Fact.calc(-1);
    }
}