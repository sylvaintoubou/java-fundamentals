package arrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Deck {
	
	/*
	String[] faces = {"ACE","DEUCE","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	String[] symbols = {"HEARTS", "DIAMOND", "CLUBS", "SPADES"};
	*/
	//Card card1 = new Card("ACE","HEARTS");
	/*
	Card[] deckOfCards = new Card[54];
	deckOfCards[0] = new Card("JOKER", "BLACK");
	deckOfCards[1] = new Card("JOKER", "RED");
	*/
	
	
	/*
	// Populate the deck
	for (int i = 2; i < deckOfCards.length; ) {
		
		for (int j = 0; j < faces.length; j++)
			
		for (int k = 0; k < symbols.length; k++)
		
		//deckOfCards[i++] = new Card(faces[j], symbols[k]) ;
	}
	*/
	
	/*
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
	*/
	
	/*
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
	*/

}
