package HoWk2;

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

        for (int j = 1; j <= quantityPlayers; j++) {
            System.out.print("Player " + j +": ");
            for (int i = 0; i <  cardsForPlayer; i++) {
                System.out.print(deck[i + (j - 1)] + " ");

                if (i % cardsForPlayer == cardsForPlayer - 1) {
                    System.out.println();
                }
            }
        }
    }

    protected void playing() {
        System.out.println("Игра: " + gameName + ", за столом инроков: " + quantityPlayers);
        cardDistribution();
    }
}
