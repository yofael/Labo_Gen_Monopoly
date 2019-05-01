package player;

import board.Board;
import board.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.piece.TypePiece;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    void createOnePlayer() {

        Player p1 = new Player("Rafael", TypePiece.BOTTE, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        }, new Board());

        assertEquals(p1.getName(), "Rafael");
        assertEquals(p1.getPiece().toString(), "Botte Case 1");
    }

    @Test
    void createListOfPlayers() {
        List<Player> listPlayers = new ArrayList<>();
        TypePiece[] tabTypePieces = TypePiece.values();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < 8; ++i) {
            listPlayers.add((new Player("Player" + (i + 1), tabTypePieces[i], new Square("1") {
                @Override
                public void landedOn(Player p) {

                }
            }, new Board())));
            list1.add(tabTypePieces[i].toString() + " Case 1");
            list2.add(listPlayers.get(i).getPiece().toString());
        }
        assertLinesMatch(list1, list2);
    }

    @BeforeEach
    void newPlayerForMoney() {
        Player p1 = new Player("Player", TypePiece.BOTTE, new Square("1") {
            @Override
            public void landedOn(Player p) {

            }
        }, new Board());

    }

    @Test
    void StartMoney() {
        Player p1 = new Player("Player", TypePiece.BOTTE, new Square("1") {
            @Override
            public void landedOn(Player p) {
            }
        }, new Board());

        assertEquals(1500, p1.getNetWorth());
    }

    @Test
    void addMoney() {
        Player p1 = new Player("Player", TypePiece.BOTTE, new Square("1") {
            @Override
            public void landedOn(Player p) {
            }
        }, new Board());

        p1.addCash(500);
        assertEquals(2000, p1.getNetWorth());
    }

    @Test
    void reduceMoney() {
        Player p1 = new Player("Player", TypePiece.BOTTE, new Square("1") {
            @Override
            public void landedOn(Player p) {
            }
        }, new Board());

        p1.reduceCash(300);
        assertEquals(1200, p1.getNetWorth());
    }

}