package test.java;
import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardClearTest {

    @Test
    public void clearRemovesAllPlacedMarkers() {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(1, 1, 'O');

        board.clear();

        assertTrue(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(1, 1));
        assertFalse(board.isFull());
    }

    @Test
    public void clearOnEmptyBoardChangesNothing() {
        Board board = new Board();

        board.clear();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertTrue(board.isCellEmpty(i, j));
            }
        }
    }


}