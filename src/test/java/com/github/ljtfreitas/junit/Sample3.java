package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Sample3 {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Hello, i'm running 'before all'");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Hello, i'm running 'before each'");
    }

    @Test
    public void sample() {
        System.out.println("Hello, i'm a test!");
    }

    @Test
    public void sample2() {
        System.out.println("Hello, i'm a another test!");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Hello, i'm running 'after each'");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Hello, i'm running 'after all'");
    }
}
