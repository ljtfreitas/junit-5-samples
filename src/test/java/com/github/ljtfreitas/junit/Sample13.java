package com.github.ljtfreitas.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Sample13 {

    @ParameterizedTest
    @MethodSource("parameterFactory")
    public void parameterizedTest(String argument) {
        assertNotNull(argument);
    }

    static Collection<String> parameterFactory() {
        return Arrays.asList("Hello", "World");
    }
}
