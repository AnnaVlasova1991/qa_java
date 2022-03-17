package com.example;

import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class EatMeatTest {
    @Test
    public void shouldReturnTypeFood() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}
