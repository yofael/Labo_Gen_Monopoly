import board.Board;
import player.Player;
import player.piece.TypePiece;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Monopoly {

    public static void main(String ... args) {
        Board board = new Board();

        List<Player> listPlayer = new ArrayList<>();
        EnumSet<TypePiece> all = EnumSet.allOf( TypePiece.class);
        List<TypePiece> list = new ArrayList<>();
        list.addAll(all);
        for (int i = 0; i < 8; ++i) {
            listPlayer.add(new Player("Player " + i, list.get(i), board.getAllSquares().get(0)));
            System.out.println(listPlayer.get(i));
        }


    }
}
