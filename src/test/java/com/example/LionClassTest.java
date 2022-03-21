package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionClassTest {


    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void shouldReturnQuantityKittensLion() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(2);
        int actual = feline.getKittens(3);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnTypeSexLionCorrect() throws Exception {
        String lionSex = "Самец";
        Lion lion = new Lion(lionSex, new Feline());
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnTypeSexLionUncorrect() throws Exception {
        String lionSex = "Самка";
        Lion lion = new Lion(lionSex, new Feline());
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void lionHasManeTest () throws Exception {
        Lion lion = new Lion ("Самец", new Feline());
        boolean actual = lion.hasMane;
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnTypeFoodLion() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        List<String> actual = lion.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}
