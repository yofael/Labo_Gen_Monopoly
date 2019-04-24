package board.SpecialSquares;

import board.Board;
import board.Square;
import player.Player;

public class GoToJailSquare extends Square{

    public GoToJailSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        p.getPiece().setNewLocation(p.getBoard().getAllSquares().get(10));
    }
}