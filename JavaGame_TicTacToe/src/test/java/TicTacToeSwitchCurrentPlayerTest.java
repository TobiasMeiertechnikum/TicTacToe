package test.java;
import main.java.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeSwitchCurrentPlayerTest {

    @Test
    public void firstSwitchActivatesPlayerO() {
        TicTacToe game = new TicTacToe();

        game.switchCurrentPlayer();

        assertEquals('O', game.getCurrentPlayer().getMarker());
    }

    @Test
    public void twoSwitchesBringBackPlayerX() {
        TicTacToe game = new TicTacToe();

        game.switchCurrentPlayer();
        game.switchCurrentPlayer();

        assertEquals('X', game.getCurrentPlayer().getMarker());
    }
}