package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testNormalString() {
        assertEquals(3, App.countVowels("Hello World"));
    }

    @Test
    public void testUppercaseVowels() {
        assertEquals(5, App.countVowels("AEIOU"));
    }

    @Test
    public void testNoVowels() {
        assertEquals(0, App.countVowels("Rhythm"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, App.countVowels(""));
    }

    @Test
    public void testMixedCase() {
        assertEquals(3, App.countVowels("AnIsHa"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullString() {
        App.countVowels(null);
    }
}