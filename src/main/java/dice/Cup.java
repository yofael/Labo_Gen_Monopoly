package dice;

public class Cup {
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();

    public void roll() {
        dice1.roll();
        dice2.roll();
    }

    public int getTotal() {
        return dice1.faceValue() + dice2.faceValue();
    }
}
