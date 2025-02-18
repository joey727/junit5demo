package com.service;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EvenOrOddTest {
    @ParameterizedTest
    @CsvSource(value= {"10, even", "5, odd", "2, even", "25, odd"})
    void testIsEvenOrOdd(int num, String expectedResult) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        String actualResult = evenOrOdd.IsEvenOrOdd(num);
        assertEquals(expectedResult, actualResult);
    }
}
