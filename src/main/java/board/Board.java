package board;

import java.util.ArrayList;

public class Board {
    private ArrayList<Square> board = new ArrayList<>();


    public Board() {
        for(int i = 1; i<=40;i++){
            board.add(new Square(Integer.toString(i)));
        }
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
