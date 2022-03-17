package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetSoundTest {
    @Test
    public void getSoundCatPositive() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }
}
