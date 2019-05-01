package board.SpecialSquares;

import board.Board;
import board.Square;
import org.junit.jupiter.api.Test;
import player.Player;
import player.piece.TypePiece;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @Test
    void CreationGoToSquare() {
        Player p1 = new Player("Player", TypePiece.CHAT, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        }, new Board());

        assertEquals("1", p1.getPiece().getLocation().getName());
        System.out.println("Avance de 30 pour aller dans la case go to jail et atterir dans la case 11");
        p1.takeTurn(30);
        assertEquals("11", p1.getPiece().getLocation().getName());
    }
}