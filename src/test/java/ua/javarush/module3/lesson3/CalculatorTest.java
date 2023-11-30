package ua.javarush.module3.lesson3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void sumShouldReturnSumForPositiveNumbers() {
        Calculator calculator = new Calculator();
        int expected = 30;

        int actual = calculator.sum(1, 2);

        assertEquals(expected, actual);
    }

}