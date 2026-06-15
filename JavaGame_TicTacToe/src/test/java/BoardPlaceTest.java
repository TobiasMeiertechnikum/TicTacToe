package test.java;
import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoardPlaceTest {

    @Test
    public void markerIsStoredAtPosition() {
        Board board = new Board();

        board.place(0, 1, 'O');

        assertEquals('O', board.getCell(0, 1));
    }

    @Test
    public void existingMarkerIsOverwritten() {
        Board board = new Board();
        board.place(2, 2, 'X');

        board.place(2, 2, 'O');

        assertEquals('O', board.getCell(2, 2));
    }

    @Test
    public void placeOutOfBoundsThrowsException() {
        Board board = new Board();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> board.place(3, 0, 'X'));
    }
}
