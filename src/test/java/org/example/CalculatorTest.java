package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, Calculator.add(-2, -3));
    }

    @Test
    public void testAddZero() {
        assertEquals(5, Calculator.add(5, 0));
    }

    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(2, Calculator.subtract(-1, -3));
    }

    @Test
    public void testSubtractZero() {
        assertEquals(5, Calculator.subtract(5, 0));
    }

    @Test
    public void testSubtractFromZero() {
        assertEquals(-5, Calculator.subtract(0, 5));
    }
}
