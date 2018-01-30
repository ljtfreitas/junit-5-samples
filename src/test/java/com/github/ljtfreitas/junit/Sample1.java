package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample1 {

    @Test
    public void myFirstJUnit5Test() {
        assertEquals(2, 1 + 1);
    }
}
