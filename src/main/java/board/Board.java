package board;

import board.SpecialSquares.GoToJailSquare;
import board.SpecialSquares.IncomeTaxSquare;
import board.SpecialSquares.RegularSquare;
import board.SpecialSquares.StartSquare;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Square> board = new ArrayList<>();

    public Board() {
        for (int i = 1; i <= 40; i++) {
            if (i == 31) {
                board.add(new GoToJailSquare(Integer.toString(i)));
            } else if (i == 5) {
                board.add(new IncomeTaxSquare(Integer.toString(i)));
            } else if (i == 1) {
                board.add(new StartSquare(Integer.toString(i)));
            } else {
                board.add(new RegularSquare(Integer.toString(i)));
            }
        }
    }

    public List<Square> getAllSquares() {
        return board;
    }

    public Square getSquare(Square oldLocate, int faceValue) {
        for (int i = 0; i < 40; i++) {
            if (oldLocate.getName().equals(board.get(i).getName())) {
                return board.get((i + faceValue) % 40);
            }
        }
        return null;
    }
}
