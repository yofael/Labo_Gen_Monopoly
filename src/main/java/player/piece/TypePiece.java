package player.piece;

public enum TypePiece {
    CHAPEAU("Chapeau"),
    BOTTE("Botte"),
    DE("Dé à coudre"),
    VOITURE("Voiture"),
    BATEAU("Bateau"),
    CHAT("Chat"),
    FER("Fer à repasser"),
    BROUETTE("Brouette");

    private String name;

    //Constructeur
    TypePiece(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}