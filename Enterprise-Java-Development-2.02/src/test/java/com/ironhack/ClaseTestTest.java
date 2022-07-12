package com.ironhack;

import com.ironhack.ClaseTest;
import com.ironhack.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ClaseTestTest {

    @Test
    void oddsToArray_positiveNumber_returnsArray() {
        int[] expectedResult = {1, 3, 5};
        int[] result = ClaseTest.oddInteger(5);
        assertArrayEquals(expectedResult, result);
    }
    @Test
    void oddsToArray_negativeInt_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            ClaseTest.oddInteger(-5);
        });
    }
    @Test
    void oddsToArray_numberOne_returnsArrayOneValue() {
        int[] expectedResult = {1};
        int[] result = ClaseTest.oddInteger(1);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void test_containsProtectedWordAbstract() {
        assertTrue(Main.containsProtectedWord("abstract"));
    }

    @Test
    void test_containsProtectedWordProtected() {
        assertTrue(Main.containsProtectedWord("protected"));
    }

    @Test
    void test_containsProtectedWordDontBreakMyHeart() {
        assertTrue(Main.containsProtectedWord("You break my heart"));
    }

    @Test
    void test_containsProtectedWordXXX() {
        assertFalse(Main.containsProtectedWord("XXX"));
    }

    @Test
    void test_containsProtectedWordILoveToBreakdance() {
        assertFalse(Main.containsProtectedWord("I love to breakdance"));
    }
}