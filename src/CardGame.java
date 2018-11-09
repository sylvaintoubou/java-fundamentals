
public class CardGame {

	private static int i;
	private static int j;
	private static int k;

	public static void main(String[] args) {
		String[] faces  = {"AGE","DELICE","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","KING","QUEEN","JACK"};
		
		String[] symbols  = {"HEARTS","DIAMOND","CLUBS","SPADES"};
		
		Card[]deckofCards = new Card[54];
		
		  deckofCards[0]= new Card ("JOKER","BLACK");
		  
		  deckofCards[1]= new Card ("JOKER","RED");
		  
		  for(int i = 2; i < deckofCards.length; ) { 
		  	for(int j = 0; j < faces.length; j++) 
		  	
		  	for(int k = 0; k < symbols.length; k++) 
		  	
		  	deckofCards[i++] = new Card (faces[j],symbols[k]);
		  }
		  
		  for(Card c : deckofCards)
		    	System.out.println(c);
		  
	}
	
	  
}