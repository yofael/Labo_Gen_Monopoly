import board.Board;
import dice.Cup;
import player.Player;
import player.piece.TypePiece;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Monopoly {

    private static Cup cup = new Cup();
    private static Board board = new Board();
    private static List<Player> listPlayer = new ArrayList<>();

    private static void playRound(Player player) {
        cup.roll();
        player.takeTurn(cup.getTotal());
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

    public static void main(String... args) {
        playGame();
    }
}
