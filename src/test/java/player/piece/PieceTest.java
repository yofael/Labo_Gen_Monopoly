package player.piece;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PieceTest {

    @Test
    void createPiece() {
        Piece p1 = new Piece(TypePiece.CHAPEAU);
        assertTrue(p1.equals("Chapeau"));
    }
}