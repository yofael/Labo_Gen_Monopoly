package board.SpecialSquares;

import board.Square;
import player.Player;

import static java.lang.Math.max;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        double money = p.getNetWorth();
        money *= 0.1;
        p.reduceCash(max(200,money));
    }
}
