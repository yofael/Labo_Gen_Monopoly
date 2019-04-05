package dice;

import java.util.Random;

public class Dice {
    private int faceValue;

    Random rand = new Random();

    public void roll() {
        faceValue = rand.nextInt(6) + 1;
    }

    public int faceValue() {
        return faceValue;
    }
}
