package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Sample9 {

    public class MyObject {

        String slow() {
            try {
                Thread.sleep(5000);
                return "slow...";

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void sample() {
        MyObject myObject = new MyObject();

        assertTimeout(Duration.ofMillis(2000), myObject::slow);
    }

    @Test
    public void sample2() {
        MyObject myObject = new MyObject();

        assertTimeoutPreemptively(Duration.ofMillis(2000), myObject::slow);
    }

    @Test
    public void sample3() {
        MyObject myObject = new MyObject();

        String output = assertTimeout(Duration.ofMillis(2000), myObject::slow);

        assertEquals("slow...", output);
    }
}
