package board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square testSquare;

    @BeforeEach
    void setUp() {
        testSquare = new Square("start") {
            @Override
            public void landedOn() {

            }
        };
    }

    @Test
    void getName() {
        assert(testSquare.getName().equals("start"));
    }
}