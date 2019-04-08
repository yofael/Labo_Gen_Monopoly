package player.piece;

import board.Square;

public class Piece {
    private TypePiece name;
    private Square square;



    public Piece(TypePiece type) {
        this.name = type;
    }

    public boolean equals(String test) {
        return name.toString().equals(test);
    }
}
