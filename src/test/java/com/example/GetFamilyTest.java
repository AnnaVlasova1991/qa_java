package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetFamilyTest {
    @Test
    public void shouldReturnFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }
}
