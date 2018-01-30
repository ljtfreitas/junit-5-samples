package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class Sample19 {

    @TestFactory
    public Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
                dynamicTest("1st dynamic test", () -> assertTrue(true)),
                dynamicTest("2nd dynamic test", () -> assertEquals(2, 1 + 1))
        );
    }

    @TestFactory
    public Stream<DynamicTest> dynamicTests2() {
        return Stream.of("Hello", "World")
                .flatMap(input -> Stream.of(
                        dynamicTest(input + " has length > 0", () -> assertTrue(input.length() > 0)),
                        dynamicTest(input + " is not empty", () -> assertFalse(input.isEmpty()))
                ));
    }

    @TestFactory
    public Stream<DynamicNode> dynamicTests3() {
        return Stream.of("Hello", "World")
                .map(input -> dynamicContainer("using " + input, Stream.of(
                        dynamicTest(input + " is not null", () -> assertNotNull(input)),
                        dynamicContainer("check properties of " + input, Stream.of(
                                dynamicTest(input + " has length > 0", () -> assertTrue(input.length() > 0)),
                                dynamicTest(input + " is not empty", () -> assertFalse(input.isEmpty()))
                        ))
                )));
    }
}
