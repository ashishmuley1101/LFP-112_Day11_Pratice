package com.bridgelabz.cards;

public class Cards {

	String[][] shuffled;
	int noOfPlayer;
	int noOfCards;
	DeckOfCards deck;

	public Cards(int noOfPlayer, int noOfCards) {
		this.noOfPlayer = noOfPlayer;
		this.noOfCards = noOfCards;
		shuffled = new String[noOfPlayer][noOfCards];
		deck = new DeckOfCards();
		deck.init();

	}

	public void printShuffledCard() {
		for (int i = 0; i < noOfPlayer; i++) {
			for (int j = 0; j < noOfCards; j++) {
				System.out.print(shuffled[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	public void shuffledCards() {
		for (int i = 0; i < noOfCards; i++) {
			for (int j = 0; j < noOfPlayer; j++) {
				int randomNumber = (int) (Math.random() * deck.deckOfCard.length);
				shuffled[j][i] = deck.deckOfCard[randomNumber];
				while (deck.deckOfCard[randomNumber].equals("null")) {
					randomNumber = (int) (Math.random() * deck.deckOfCard.length);
					shuffled[j][i] = deck.deckOfCard[randomNumber];
				}
				deck.deckOfCard[randomNumber] = "null";
			}
		}
	}

	public static void main(String[] args) {
		Cards card = new Cards(4, 9);
		card.shuffledCards();
		card.printShuffledCard();

	}

}
