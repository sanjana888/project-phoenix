package com.healthtech;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DosageCalculatorTest {

    @Test
    void testCalculateDosage() {
        double dosage = DosageCalculator.calculateDosage(50);
        assertEquals(100.0, dosage);
    }

    @Test
    void testZeroWeight() {
        double dosage = DosageCalculator.calculateDosage(0);
        assertEquals(0.0, dosage);
    }
}
