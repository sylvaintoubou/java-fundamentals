
public class Card {

	private String cardFace;
	private String symbol;
	public Card(String cardFace, String symbol) {
		
		this.cardFace = cardFace;
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return  getCardFace() + " of " + getSymbol() ;
	}

	public String getCardFace() {
		return cardFace;
	}
	
	public void setCardFace(String cardFace) {
		this.cardFace = cardFace;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	

}
