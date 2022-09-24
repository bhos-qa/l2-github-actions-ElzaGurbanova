package org.First;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void checkIntegerAdditionTest() {
        String word = "ThisIsTesting";
        assertEquals(13, Main.returnStringLength(word));
    }
}