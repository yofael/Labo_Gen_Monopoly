package board.SpecialSquares;

import board.Board;
import board.Square;
import org.junit.jupiter.api.Test;
import player.Player;
import player.piece.TypePiece;

import static org.junit.jupiter.api.Assertions.*;

class RegularSquareTest {

    @Test
    void CreationRegularSquare() {
        Player p1 = new Player("Player", TypePiece.CHAT, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        }, new Board());

        assertEquals("1", p1.getPiece().getLocation().getName());
        p1.takeTurn(8);
        assertEquals("9", p1.getPiece().getLocation().getName());
        assertEquals(1500, p1.getNetWorth());
    }

}