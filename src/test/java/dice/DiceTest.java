package dice;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private static final Logger LOG = Logger.getLogger(DiceTest.class.getName());
    @Test
    void RandomRollDice(){
        Dice dice = new Dice();

        for(int i = 0; i < 10; ++i) {
            dice.roll();
            LOG.info("Dice face value = " + dice.faceValue());
            assertTrue(dice.faceValue() < 7 && dice.faceValue() > 0);
        }
    }
}