package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample2 {

    @MyTest
    public void testWithMyAnnotation() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface MyTest {
    }
}
