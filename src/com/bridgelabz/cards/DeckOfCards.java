package com.bridgelabz.cards;

public class DeckOfCards {

	String[] suits, rank;
	String[] deckOfCard;

	public DeckOfCards() {
		suits = new String[] { "C", "H", "S", "D" };
		rank = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		deckOfCard = new String[52];
	}

	public void init() {
		int deckIndex = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deckOfCard[deckIndex++] = rank[j] + " (" + suits[i] + ")";
			}
		}
	}

	public void printDeckOfCard() {
		for (int i = 0; i < deckOfCard.length; i++) {
			System.out.println(deckOfCard[i]);

		}
	}
}
