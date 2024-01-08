package be.demo.polymorphism;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CatTest {
    @Test
    public void testGetName() {
        Cat garfield = new Cat("Garfield");

        assertEquals(garfield.getName(), "Garfield");
    }
}
