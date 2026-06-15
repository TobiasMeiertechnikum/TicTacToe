package test.java;
import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicTacToeHasWinnerTest {

    @Test
    public void emptyBoardHasNoWinner() {
        TicTacToe game = new TicTacToe();

        assertFalse(game.hasWinner());
    }

    @Test
    public void fullRowOfCurrentPlayerWins() {
        TicTacToe game = new TicTacToe();
        char marker = game.getCurrentPlayer().getMarker();
        game.getBoard().place(0, 0, marker);
        game.getBoard().place(0, 1, marker);
        game.getBoard().place(0, 2, marker);

        assertTrue(game.hasWinner());
    }

    @Test
    public void fullColumnOfCurrentPlayerWins() {
        TicTacToe game = new TicTacToe();
        char marker = game.getCurrentPlayer().getMarker();
        game.getBoard().place(0, 1, marker);
        game.getBoard().place(1, 1, marker);
        game.getBoard().place(2, 1, marker);

        assertTrue(game.hasWinner());
    }

    @Test
    public void fullDiagonalOfCurrentPlayerWins() {
        TicTacToe game = new TicTacToe();
        char marker = game.getCurrentPlayer().getMarker();
        game.getBoard().place(0, 0, marker);
        game.getBoard().place(1, 1, marker);
        game.getBoard().place(2, 2, marker);

        assertTrue(game.hasWinner());
    }

    @Test
    public void mixedRowIsNotAWinner() {
        TicTacToe game = new TicTacToe();
        char marker = game.getCurrentPlayer().getMarker();
        game.getBoard().place(0, 0, marker);
        game.getBoard().place(0, 1, 'O');
        game.getBoard().place(0, 2, marker);

        assertFalse(game.hasWinner());
    }
}