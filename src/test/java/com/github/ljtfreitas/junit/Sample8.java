package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Sample8 {

    public class MyObject {

        void dangerous(String arg) {
            throw new IllegalArgumentException("Invalid argument: " + arg);
        }

        void safe() {
        }
    }

    @Test
    public void sample() {
        MyObject myObject = new MyObject();

        assertThrows(IllegalArgumentException.class, () -> myObject.dangerous("bla"));
    }

    @Test
    public void sample2() {
        MyObject myObject = new MyObject();

        assertThrows(IllegalStateException.class, () -> myObject.dangerous("bla"));
    }

    @Test
    public void sample3() {
        MyObject myObject = new MyObject();

        assertThrows(IllegalStateException.class, myObject::safe);
    }

    @Test
    public void sample4() {
        MyObject myObject = new MyObject();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> myObject.dangerous("bla"));


        assertEquals("Invalid argument: bla", exception.getMessage());
    }
}
