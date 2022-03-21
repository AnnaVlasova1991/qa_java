package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DoesHaveManeParametrizedTest {

    private String lionSex;
    private boolean expected;

    public void LionTest(String lionSex, boolean expected) throws Exception {

        this.lionSex = lionSex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getLionSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void shouldBeLionMan() throws Exception {
        Lion lion = new Lion(lionSex, new Feline());
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

}

