package dice;

public class Cup {
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();

    public void roll() {
        dice1.roll();
        dice2.roll();
    }

    public int getTotal() {
        return dice1.faceValue() + dice2.faceValue();
    }
}
