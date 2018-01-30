package com.github.ljtfreitas.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Sample15 {

    @ParameterizedTest
    @CsvSource({ "Hello, 1", "World, 2"})
    public void parameterizedTest(String argument, int count) {
        assertNotNull(argument);
        assertTrue(count > 0);
    }
}
