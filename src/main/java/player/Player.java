package player;

import board.Square;
import player.piece.Piece;
import player.piece.TypePiece;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name, TypePiece type, Square location) {
        this.name = name;
        this.piece = new Piece(type, location);
    }
    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public String toString() {
        return name + " " + piece;
    }
}