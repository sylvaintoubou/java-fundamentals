package arrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
	
		
		
		
		
		
		/*// Populate the deck
		for (int i = 2; i < deckOfCards.length; ) {
			
			for (int j = 0; j < faces.length; j++)
				
			for (int k = 0; k < symbols.length; k++)
			
			deckOfCards[i++] = new Card(faces[j], symbols[k]) ;
		}
		

	
		// Print every single card of the deck
		System.out.println("Ordered deck of cards");
		System.out.println("......................\n");
		for(Card c :deckOfCards) {
			System.out.println(c);
		}
		System.out.println("\n");
		
		// Shuffle cards
		System.out.println("Shuffled deck of cards");
		System.out.println("......................\n");
		deckOfCards = shuffleCards(deckOfCards);
		for(Card c :deckOfCards) {
			System.out.println(c);
		}
	
		
		
		System.out.println(printDeck());
		
		User player1 = new User("Joe", 1);
		
		User player2 = new User("Jack", 2);*/
		
		
		
		
		
	}
	
	
	String[] faces = {"ACE","DEUCE","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	String[] symbols = {"HEARTS", "DIAMOND", "CLUBS", "SPADES"};
	
	Card card1 = new Card("ACE","HEARTS");
	
	Card[] deckOfCards = new Card[54];
	deckOfCards[0] = new Card("JOKER", "BLACK");
	deckOfCards[1] = new Card("JOKER", "RED");
	
	
	
	
	// Populate the deck
	for (int i = 2; i < deckOfCards.length; ) {
		
		for (int j = 0; j < faces.length; j++)
			
		for (int k = 0; k < symbols.length; k++)
		
		//deckOfCards[i++] = new Card(faces[j], symbols[k]) ;
	}
	
	

	public static Card[] shuffleCards(Card[] cards) {
		
		Random random = new Random();
		
		for(int i = 0; i < 10000000; i++) {
			int oldIndex = random.nextInt(54);
			int newIndex = random.nextInt(54);
			
			Card temporalCard = cards[oldIndex];
			cards[oldIndex] = cards[newIndex];
			cards[newIndex] = temporalCard;
			
		}
	
			return cards;
	}
	
	
	
	public static List populateDeck() {
		
		String[] faces = {"ACE","DEUCE","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
		String[] symbols = {"HEARTS", "DIAMOND", "CLUBS", "SPADES"};
		
		//Card card1 = new Card("ACE","HEARTS");
		
		Card[] deckOfCards = new Card[54];
		deckOfCards[0] = new Card("JOKER", "BLACK");
		deckOfCards[1] = new Card("JOKER", "RED");
		
		List<Card> listOfCards = new ArrayList<>();
		for(Card myCard : deckOfCards)
			listOfCards.add(myCard);
		Iterator iterator = listOfCards.iterator();
		
		//System.out.println(listofCards);
		return listOfCards;
	}
	


}
