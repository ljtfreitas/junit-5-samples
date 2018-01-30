package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample5 {

    @Test
    @DisplayName("The sum (1 + 1) must be 2")
    public void testWithDisplayName() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @DisplayName("The sum (1 + 1) must be 2, with emoji \uD83D\uDE0D!")
    public void testWithDisplayName2() {
        assertEquals(2, 1 + 1);
    }
}
