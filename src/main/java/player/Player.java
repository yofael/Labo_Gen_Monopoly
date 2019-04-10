package player;

import player.piece.Piece;
import player.piece.TypePiece;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name, TypePiece type) {
        this.name = name;
        this.piece = new Piece(type);
    }
    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }
}