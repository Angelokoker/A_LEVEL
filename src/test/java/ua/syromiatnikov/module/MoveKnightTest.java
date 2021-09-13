package ua.syromiatnikov.module;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoveKnightTest {


    @Test
    void checkOnTheMove() {
        assertTrue(MoveKnight.checkOnTheMove("B8","C6"));
    }
}