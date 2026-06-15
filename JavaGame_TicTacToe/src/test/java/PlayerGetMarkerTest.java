package test.java;
import main.java.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PlayerGetMarkerTest {

    @Test
    public void markerMatchesConstructorArgument() {
        Player player = new Player('X');

        assertEquals('X', player.getMarker());
    }

    @Test
    public void differentPlayersHaveDifferentMarkers() {
        Player playerX = new Player('X');
        Player playerO = new Player('O');

        assertNotEquals(playerX.getMarker(), playerO.getMarker());
    }
}