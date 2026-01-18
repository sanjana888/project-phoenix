package com.healthtech;

public class DosageCalculator {

    public static double calculateDosage(double weightKg) {
        // Simple rule: 2 mg per kg
        return weightKg * 2.0;
    }
}
