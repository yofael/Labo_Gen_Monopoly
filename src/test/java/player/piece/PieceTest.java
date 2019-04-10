package player.piece;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PieceTest {

    @Test
    void createPiece() {
        Piece p1 = new Piece(TypePiece.CHAPEAU);
        assertEquals(p1.toString(), "Chapeau");
    }
}