package dice;

import org.junit.jupiter.api.RepeatedTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    private static final Logger LOG = Logger.getLogger(DiceTest.class.getName());

    @RepeatedTest(10)
    void RandomRollCup() {
        Cup cup = new Cup();
        cup.roll();
        LOG.info("Cup value = " + cup.getTotal());
        assertTrue(cup.getTotal() < 13 && cup.getTotal() > 1);
    }

}