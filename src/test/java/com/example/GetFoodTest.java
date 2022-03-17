package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetFoodTest {
    @Test
    public void shouldReturnTypeFoodCat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}
