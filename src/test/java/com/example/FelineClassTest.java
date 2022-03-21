package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineClassTest {
    @Test
    public void shouldReturnTypeFood() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnQuantityKittens() {
        Feline feline = new Feline();
        int kittensCount = 5;
        int actual = feline.getKittens(kittensCount);
        int expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnQuantityKittensWithoutCount() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Mock
    Feline feline;

    @Test
    public void getKittensCorrectArgumentPositive() {
        feline.getKittens(4);
        Mockito.verify(feline).getKittens(4);
    }
}
