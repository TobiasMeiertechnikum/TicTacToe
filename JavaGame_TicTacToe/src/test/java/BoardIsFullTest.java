package test.java;
import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardIsFullTest {

    @Test
    public void emptyBoardIsNotFull() {
        Board board = new Board();

        assertFalse(board.isFull());
    }

    @Test
    public void completelyFilledBoardIsFull() {
        Board board = new Board();
        fillBoard(board);

        assertTrue(board.isFull());
    }

    @Test
    public void almostFullBoardIsNotFull() {
        Board board = new Board();
        fillBoard(board);
        board.place(2, 2, ' ');

        assertFalse(board.isFull());
    }

    private void fillBoard(Board board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board.place(i, j, 'X');
            }
        }
    }
}