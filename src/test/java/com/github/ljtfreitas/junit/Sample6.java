package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample6 {

    @Test
    public void sample() {
        assertEquals(2, 1 + 1, "The sum (1 + 1) must be 2");

        assertEquals(2, 1 + 1, () -> "The sum (1 + 1) must be 2");
    }
}
