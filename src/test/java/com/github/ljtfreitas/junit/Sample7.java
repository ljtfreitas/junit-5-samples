package com.github.ljtfreitas.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sample7 {

    @Test
    public void sample() {
        Person person = new Person("Tiago de Freitas Lima", 20);

        assertAll(
                () -> assertEquals("Tiago Lima", person.name),
                () -> assertEquals(32, person.age));
    }

    @Test
    public void sample2() {
        Person person = new Person("Tiago de Freitas Lima", 20);

        assertAll("Something is wrong...",
                () -> assertEquals("Tiago Lima", person.name),
                () -> assertEquals(32, person.age));
    }

    class Person {

        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

}
