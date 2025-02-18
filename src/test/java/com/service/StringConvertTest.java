package com.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class StringConvertTest {
    @Test
    void testConvToInteger() {
        String str = null;
        assertThrows(IllegalArgumentException.class, () -> StringConvert.convToInteger(str));
    }
}
