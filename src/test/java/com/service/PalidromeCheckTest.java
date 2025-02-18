package com.service;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalidromeCheckTest {
    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "radar"})
    void testIsReverse(String str) {
        PalidromeCheck check = new PalidromeCheck();
        boolean actual = check.isReverse(str);
        assertTrue(actual);
    }
}
