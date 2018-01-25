package com.jjhellberg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {
    Logic logic = new Logic();

    @Test
    public void testExample() {
        assertEquals(5, logic.getCycles(new int[]{0,2,7,0}));
    }
}