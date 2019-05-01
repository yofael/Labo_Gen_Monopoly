package player.piece;

import board.Square;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import player.Player;

import static org.junit.jupiter.api.Assertions.*;


class PieceTest {

    @ParameterizedTest
    @ValueSource(strings = {"Chapeau Case 1"})
    void createPiece(String message) {
        Piece p1 = new Piece(TypePiece.CHAPEAU, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        });
        assertEquals(p1.toString(), message);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Start"})
    void getSetLocationTest(String message) {
        Piece p1 = new Piece(TypePiece.BOTTE, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        });

        p1.setNewLocation(new Square(message) {
            @Override
            public void landedOn(Player p) {

            }
        });
        assertEquals(p1.getLocation().getName(), message);
    }


}