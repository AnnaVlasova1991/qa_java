package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetFoodLionTest {
    @Test
    public void shouldReturnTypeFoodLion() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List<String> actual = lion.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
}
