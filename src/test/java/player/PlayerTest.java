package player;

import org.junit.jupiter.api.Test;
import player.piece.TypePiece;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void createOnePlayer() {
        Player p1 = new Player("Rafael", TypePiece.BOTTE);

        assertTrue(p1.getName().equals("Rafael"));
        assertTrue(p1.getPiece().equals("Botte"));
    }
}