package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class GetFoodTestAnimal {
    @Test
    public void shouldReturnTypeFoodAnimalGrace() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Травоядное";
        List<String> actual = animal.getFood(animalKind);
        List<String> expected = Arrays.asList("Трава", "Различные растения");
        assertEquals(expected, actual);
    }
    @Test
    public void getFamilyAnimalCorrect() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actual);
    }
}
