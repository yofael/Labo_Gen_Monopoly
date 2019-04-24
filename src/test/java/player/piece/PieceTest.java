package player.piece;

import board.Square;
import org.junit.jupiter.api.Test;
import player.Player;

import static org.junit.jupiter.api.Assertions.*;


class PieceTest {


    @Test
    void createPiece() {
        Piece p1 = new Piece(TypePiece.CHAPEAU, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        });
        assertEquals(p1.toString(), "Chapeau Case 1");
    }

    @Test
    void getSetLocationTest() {
        Piece p1 = new Piece(TypePiece.BOTTE, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        });

        p1.setNewLocation(new Square("Start") {
            @Override
            public void landedOn(Player p) {

            }
        });
        assertEquals(p1.getLocation().getName(),"Start");
    }


}