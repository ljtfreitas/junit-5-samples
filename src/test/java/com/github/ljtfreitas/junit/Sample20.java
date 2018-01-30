package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class Sample20 implements EqualsContract<String> {

    @Override
    public String createValue() {
        return "Hello";
    }

    @Override
    public String createNotEqualValue() {
        return "World";
    }
}
