package test.java;
import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoardGetCellTest {

    @Test
    public void emptyCellContainsSpace() {
        Board board = new Board();

        assertEquals(' ', board.getCell(0, 0));
    }

    @Test
    public void placedMarkerIsReturned() {
        Board board = new Board();
        board.place(1, 1, 'X');

        assertEquals('X', board.getCell(1, 1));
    }

    @Test
    public void getCellOutOfBoundsThrowsException() {
        Board board = new Board();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> board.getCell(-1, 0));
    }
}