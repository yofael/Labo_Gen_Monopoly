package board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.Player;
import player.piece.TypePiece;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    private Square testSquare;

    @BeforeEach
    void setUp() {
        testSquare = new Square("start") {
            @Override
            public void landedOn(Player p) {

            }
        };
    }

    @Test
    void sameSquares() {
        Board board = new Board();
        Square s = new Square("start") {
            @Override
            public void landedOn(Player p) {

            }
        };
        Player p1 = new Player("Rafael", TypePiece.BOTTE, s, board);
        Player p2 = new Player("Yohan", TypePiece.CHAT, s, board);

        assertSame(p1.getPiece().getLocation(), p2.getPiece().getLocation());
    }
}