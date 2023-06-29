package HoWk2;

public enum Rank {
    THO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private final String rank;

    Rank(String name) {
        this.rank = name;
    }

    public String getRank() {
        return rank;
    }
}
