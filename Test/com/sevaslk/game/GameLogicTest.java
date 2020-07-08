package com.sevaslk.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameLogicTest {

    @Test
    void startGame() {
        assertEquals(1, StepOptions.STONE.getId());
    }
}