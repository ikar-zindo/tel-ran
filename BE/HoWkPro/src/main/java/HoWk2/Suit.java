package HoWk2;

public enum Suit {
    CLUBS('♣'),
    HEARTS('♥'),
    DIAMONDS('♦'),
    SPADES('♠');

    private final char suit;

    Suit(char type) {
        this.suit = type;
    }

    public char getSuit() {
        return suit;
    }
}
