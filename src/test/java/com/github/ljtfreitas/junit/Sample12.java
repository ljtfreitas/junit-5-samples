package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class Sample12 {

    @ParameterizedTest
    @ValueSource(strings = { "Hello", "World" })
    public void parameterizedTest(String argument) {
        assertNotNull(argument);
    }

    @ParameterizedTest(name =  "Parameterized test {index}: {0}")
    @ValueSource(strings = { "Hello", "World" })
    public void parameterizedTest2(String argument) {
        assertNotNull(argument);
    }

    @ParameterizedTest(name =  "Parameterized test {index}: {0}")
    @EnumSource(TimeUnit.class)
    public void parameterizedTest3(TimeUnit timeUnit) {
        assertNotNull(timeUnit);
    }
}
