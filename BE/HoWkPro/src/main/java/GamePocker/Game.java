package GamePocker;

import java.util.Random;
import java.util.Scanner;

public class Game {

    String gameName;
    final int cardsForPlayer = 5;
    private final int quantityCards = Suit.values().length * Rank.values().length;
    private final Card[] deck;
    private int quantityPlayers;

    public Game(String gameName) {

        this.gameName = gameName;
        deckInitialization();
        this.deck = deckInitialization();
        addingPlayers();
        deckShuffling();
    }

    // deck initialization
    private Card[] deckInitialization() {

        Card[] deck = new Card[quantityCards];
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = new Card(ranks[i], suits[j]);
            }
        }
        return deck;
    }

    // adding players
    private void addingPlayers() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Сколько человек за столом: ");
            quantityPlayers = sc.nextInt();

            if (cardsForPlayer * quantityPlayers > quantityCards) {
                System.out.println("Игроков слишком много, карт на всех не зватит");
            } else if (quantityPlayers < 1) {
                System.out.println("Стол пуст");
            } else if (quantityPlayers == 1) {
                System.out.println("Играешь сам");
                break;
            } else if (cardsForPlayer * quantityPlayers <= quantityCards) {
                break;
            }
        }
        sc.close();
    }

    // deck shuffling
    private void deckShuffling() {

        Random r = new Random();
        Card tmpDeck;

        for (int i = 0; i < deck.length; i++) {
            int card = i + (r.nextInt(deck.length - i));
            tmpDeck = deck[i];
            deck[i] = deck[card];
            deck[card] = tmpDeck;
        }
    }

    // the shuffled deck is displayed
    private void cardDistribution() {

        for (int i = 0; i <= quantityPlayers; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j <  cardsForPlayer; j++) {
//                Thread.sleep(300);
                System.out.print(deck[cardsForPlayer * i + j] + " ");

                if (j % cardsForPlayer == cardsForPlayer - 1) {
                    System.out.println();
                }
            }
        }
    }
    protected void playing() {
        System.out.println("Игра: " + gameName + ", за столом игроков: " + quantityPlayers);
        cardDistribution();
    }
}
