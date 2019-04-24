package board;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.Player;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board testBoard;
    private static final Logger LOG = Logger.getLogger(BoardTest.class.getName());
    @BeforeEach
    void setUp() {
        testBoard = new Board();
    }


    @Test
    void getSquareTest() {
       for(int i=1;i<40;i++) {
           Square old = new Square(Integer.toString(i)) {
               @Override
               public void landedOn(Player p) {

               }
           };
           Square s = testBoard.getSquare(old,12);
           LOG.info(s.getName());
           assertEquals(s.getName(),Integer.toString((((i + 12))>40)?((i + 12)%41)+1:(i + 12)));

       }

    }


}