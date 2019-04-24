import board.Board;
import dice.Dice;
import player.Player;
import player.piece.TypePiece;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Monopoly {

    static Dice d1 = new Dice();
    static Dice d2 = new Dice();
    static Board board = new Board();
    static List<Player> listPlayer = new ArrayList<>();

    private static void playRound(Player player) {
        d1.roll();
        d2.roll();
        player.takeTurn(d1.faceValue() + d2.faceValue());
        System.out.println(player);
    }
    private static void playGame() {

        EnumSet<TypePiece> all = EnumSet.allOf(TypePiece.class);
        List<TypePiece> list = new ArrayList<>();
        list.addAll(all);
        for (int i = 0; i < 8; ++i) {
            listPlayer.add(new Player("Player " + i, list.get(i), board.getAllSquares().get(0), board));
            System.out.println(listPlayer.get(i));
        }

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 8; ++j) {
                playRound(listPlayer.get(j));
            }
        }
    }

    public static void main(String ... args) {
        playGame();
    }

}
