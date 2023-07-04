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
    private void cardDistribution() throws InterruptedException {

        for (int j = 1; j <= quantityPlayers; j++) {
            System.out.print("Player " + j +": ");
            for (int i = 0; i <  cardsForPlayer; i++) {
                Thread.sleep(300);
                System.out.print(deck[i + (j - 1)] + " ");

                if (i % cardsForPlayer == cardsForPlayer - 1) {
                    System.out.println();
                }
            }
        }
    }

    // flop
    private void flop() throws InterruptedException {
        System.out.println("Показываем Flop (первые 3 карты):");

        for (int i = quantityPlayers * cardsForPlayer; i < (quantityPlayers * cardsForPlayer) + 3; i++) {
            Thread.sleep(500);
            System.out.print(deck[i]);
        }
    }

    //turn
    private void turn() throws InterruptedException {
        System.out.println("Показываем Flop (первые 3 карты):");
        Thread.sleep(500);

        for (int i = quantityPlayers * cardsForPlayer; i < (quantityPlayers * cardsForPlayer) + 3; i++) {
            Thread.sleep(500);
            System.out.print(deck[i]);
        }
    }

    // river
    private void river() throws InterruptedException {
        System.out.println("Показываем Flop (первые 3 карты):");

        for (int i = quantityPlayers * cardsForPlayer; i < (quantityPlayers * cardsForPlayer) + 3; i++) {
            Thread.sleep(500);
            System.out.print(deck[i] + " ");
        }
    }

    protected void playing() throws InterruptedException {
        System.out.println("Игра: " + gameName + ", за столом игроков: " + quantityPlayers);
        cardDistribution();

        Thread.sleep(500);

        flop();
    }
}
