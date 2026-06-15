package test.java;
import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicTacToeConstructorTest {

    @Test
    public void newGameStartsWithPlayerX() {
        TicTacToe game = new TicTacToe();

        assertEquals('X', game.getCurrentPlayer().getMarker());
    }

    @Test
    public void newGameHasEmptyBoard() {
        TicTacToe game = new TicTacToe();

        assertFalse(game.getBoard().isFull());
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertTrue(game.getBoard().isCellEmpty(i, j));
            }
        }
    }
}