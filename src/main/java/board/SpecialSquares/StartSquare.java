package board.SpecialSquares;

import board.Square;
import player.Player;

public class StartSquare extends Square {

    public StartSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        p.addCash(200);
    }
}
