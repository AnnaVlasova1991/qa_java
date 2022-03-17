package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GetKittensLion {


    Feline feline = Mockito.mock(Feline.class);

    @Test
    public void shouldReturnQuantityKittensLion() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(2);
        int kittensCount = feline.getKittens(2);
        int actual = lion.getKittens(kittensCount);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
