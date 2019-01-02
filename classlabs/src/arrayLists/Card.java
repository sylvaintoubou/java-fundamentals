package arrayLists;

public class Card {

	private String cardFace;
	private String cardSymbol;
	
	public Card(String cardFace, String cardSymbol){
		
		super();
		this.cardFace = cardFace;
		this.cardSymbol = cardSymbol;
		
	}

	@Override
	public String toString() {
		return getCardFace() + " of " + getCardSymbol();
	}

	public String getCardFace() {
		return cardFace;
	}

	public void setCardFace(String cardFace) {
		this.cardFace = cardFace;
	}

	public String getCardSymbol() {
		return cardSymbol;
	}

	public void setCardSymbol(String cardSymbol) {
		this.cardSymbol = cardSymbol;
	}

	
	
	
	
	
}
