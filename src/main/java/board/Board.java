package board;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Square> board = new ArrayList<>();


    public Board() {
        for(int i = 1; i<=40;i++){
            board.add(new Square(Integer.toString(i)) {
                @Override
                public void landedOn() {

                }
            });
        }
    }

    public List<Square> getAllSquares() {
        return board;
    }

    public Square getSquare(Square oldLocate,int faceValue){
        for(int i = 0;i<40;i++){
            if(oldLocate.getName().equals(board.get(i).getName())){
                return board.get((i + faceValue) % 40);
            }
        }
        return null;
    }
}
