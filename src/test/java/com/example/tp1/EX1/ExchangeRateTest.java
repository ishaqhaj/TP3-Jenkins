package com.example.tp1.EX1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExchangeRateTest {

    private ExchangeRate exchangeRate;

    @BeforeEach
    void setUp() {
        exchangeRate = new ExchangeRate();
    }

    @Test
    void madToEurRateIsCorrect() {
        assertEquals(0.09, exchangeRate.getMadToEurRate(), 0.001);
    }

    @Test
    void eurToMadRateIsCorrect() {
        assertEquals(11.11, exchangeRate.getEurToMadRate(), 0.001);
    }

    @Test
    void changeMadToEurRate() {
        exchangeRate.setMadToEurRate(0.1);

        assertEquals(0.1, exchangeRate.getMadToEurRate(), 0.001);
        assertEquals(10.0, exchangeRate.getEurToMadRate(), 0.001);
    }

    @Test
    void madToEurRateCannotBeNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> exchangeRate.setMadToEurRate(-0.1));
    }

    @Test
    void madToEurRateCannotBeZero() {
        assertThrows(IllegalArgumentException.class,
                () -> exchangeRate.setMadToEurRate(0));
    }

    @Test
    void changeEurToMadRate() {
        exchangeRate.setEurToMadRate(10.0);

        assertEquals(10.0, exchangeRate.getEurToMadRate(), 0.001);
        assertEquals(0.1, exchangeRate.getMadToEurRate(), 0.001);
    }

    @Test
    void eurToMadRateCannotBeNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> exchangeRate.setEurToMadRate(-10.0));
    }
}
