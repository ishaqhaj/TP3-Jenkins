package com.example.tp1.EX1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConverterTest {

    private ExchangeRate exchangeRate;
    private CurrencyConverter converter;

    @BeforeEach
    void setUp() {
        exchangeRate = new ExchangeRate();
        converter = new CurrencyConverter(exchangeRate);
    }

    @Test
    void madToEurWithZero() {
        assertEquals(0.0, converter.convertMadToEur(0), 0.001);
    }

    @Test
    void madToEurWithNegativeValue() {
        assertThrows(IllegalArgumentException.class,
                () -> converter.convertMadToEur(-1));
    }

    @Test
    void madToEurWithPositiveValue() {
        assertEquals(0.09, converter.convertMadToEur(1), 0.001);
    }

    @Test
    void eurToMadWithZero() {
        assertEquals(0.0, converter.convertEurToMad(0), 0.001);
    }

    @Test
    void eurToMadWithNegativeValue() {
        assertThrows(IllegalArgumentException.class,
                () -> converter.convertEurToMad(-1));
    }

    @Test
    void eurToMadWithPositiveValue() {
        assertEquals(11.11, converter.convertEurToMad(1), 0.001);
    }

    @Test
    void madToEurWithRandomAmount() {
        double amount = Math.random() * 100;
        double expected = amount * 0.09;
        assertEquals(expected, converter.convertMadToEur(amount), 0.001);
    }

    @Test
    void eurToMadWithRandomAmount() {
        double amount = Math.random() * 100;
        double expected = amount * 11.11;
        assertEquals(expected, converter.convertEurToMad(amount), 0.001);
    }
}
