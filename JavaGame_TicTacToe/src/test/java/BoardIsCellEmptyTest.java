package test.java;
import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardIsCellEmptyTest {

    @Test
    public void freshCellIsEmpty() {
        Board board = new Board();

        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    public void occupiedCellIsNotEmpty() {
        Board board = new Board();
        board.place(1, 2, 'X');

        assertFalse(board.isCellEmpty(1, 2));
    }

    @Test
    public void outOfBoundsThrowsException() {
        Board board = new Board();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> board.isCellEmpty(5, 5));
    }
}
