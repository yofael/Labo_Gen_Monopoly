package player;

import board.Board;
import board.Square;
import player.piece.Piece;
import player.piece.TypePiece;

public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private double money;

    public Player(String name, TypePiece type, Square location, Board board) {
        this.money = 1500;
        this.board = board;
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
        return name + " " + piece + " Cash : " + money;
    }

    public void takeTurn(int faceValue) {
        piece.setNewLocation(board.getSquare(piece.getLocation(), faceValue));
        piece.getLocation().landedOn(this);
    }

    public void addCash(double money) {
        this.money += money;
    }

    public Board getBoard() {
        return board;
    }

    public void reduceCash(double money) {
        this.money -= money;
    }

    public double getNetWorth() {
        return money;
    }
}