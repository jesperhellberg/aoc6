package com.jjhellberg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    Logic logic = new Logic();

    @Test
    public void testExample() {
        int[] testInput = new int[]{0,2,7,0};
        assertEquals(5, logic.getCycles(testInput).getKey().intValue());
    }

    @Test
    public void testExample2() {
        int[] testInput = new int[]{0,2,7,0};
        logic.getCycles(testInput);
        assertEquals(4, logic.getCycles(testInput).getKey().intValue());
    }
}