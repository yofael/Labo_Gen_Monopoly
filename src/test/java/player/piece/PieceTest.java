package player.piece;

import board.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PieceTest {


    @Test
    void createPiece() {
        Piece p1 = new Piece(TypePiece.CHAPEAU, new Square("1"));
        assertEquals(p1.toString(), "Chapeau");
    }

    @Test
    void getSetLocationTest() {
        Piece p1 = new Piece(TypePiece.BOTTE, new Square("1"));

        p1.setNewLocation(new Square("Start"));
        assertEquals(p1.getLocation().getName(),"Start");
    }


}