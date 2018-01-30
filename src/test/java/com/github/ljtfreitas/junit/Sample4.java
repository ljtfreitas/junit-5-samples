package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class Sample4 {

    @Test
    public void sample() {
        System.out.println("Hello, i'm a test!, on instance " + this);
    }

    @Test
    public void sample2() {
        System.out.println("Hello, i'm a another test!, on instance " + this);
    }

}
