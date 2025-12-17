package com.example.tp1.EX1;

public class CurrencyConverter {
    private final ExchangeRate exchangeRate;

    public CurrencyConverter(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertMadToEur(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Le montant ne peut pas être négatif");
        }
        return amount * exchangeRate.getMadToEurRate();
    }

    public double convertEurToMad(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Le montant ne peut pas être négatif");
        }
        return amount * exchangeRate.getEurToMadRate();
    }
}