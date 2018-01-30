package com.github.ljtfreitas.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Sample16 {

    @ParameterizedTest
    @CsvFileSource(resources = "/parameters.csv")
    public void parameterizedTest(String argument, int count) {
        assertNotNull(argument);
        assertTrue(count > 0);
    }
}
