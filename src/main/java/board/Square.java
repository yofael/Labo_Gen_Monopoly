package board;

import player.Player;

public abstract class Square {

    private String name;

    public Square(String name) {
        this.name = name;
    }

    public abstract void landedOn(Player p);

    public String getName() {
        return name;
    }
}