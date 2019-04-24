package board.SpecialSquares;

import board.Board;
import board.Square;
import org.junit.jupiter.api.Test;
import player.Player;
import player.piece.TypePiece;

import static org.junit.jupiter.api.Assertions.*;

class StartSquareTest {

    @Test
    void CreationStartSquare() {
        Player p1 = new Player("Player", TypePiece.CHAT, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        }, new Board());
        assertEquals(1500, p1.getNetWorth());
        p1.takeTurn(40);

        assertEquals(1700, p1.getNetWorth());

    }

}