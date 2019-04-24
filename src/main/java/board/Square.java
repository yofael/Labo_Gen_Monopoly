package board;

public abstract class Square {

    private String name;

    public Square(String name) {
        this.name = name;
    }

    public abstract void landedOn();

    public String getName() {
        return name;
    }
}
