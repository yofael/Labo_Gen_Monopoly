package player.piece;

import board.Square;

public class Piece {
    private TypePiece name;
    private Square square;

    public Piece(TypePiece type, Square location) {
        square = location;
        this.name = type;
    }

    public String toString() {
        return name.toString() + " Case " + square.getName();
    }

    public Square getLocation(){return square;}

    public void setNewLocation(Square newLocation){
        square = newLocation;
    }
}
