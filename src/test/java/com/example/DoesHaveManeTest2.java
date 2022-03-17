package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
public class DoesHaveManeTest2 {
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
    public void testLionConstructor () throws Exception {
        Lion lion = new Lion ("Самец", new Feline());
        boolean actual = lion.hasMane;
        boolean expected = true;
        assertEquals(expected, actual);
    }
}

