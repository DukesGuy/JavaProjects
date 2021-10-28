package week6;

public class Card {
	
	private int value;
	private String cardName;
	private String suit;
	
	public Card(String cardName, String suit, int value) {
		this.cardName = cardName;
		this.setSuit(suit);
		this.value = value;
	}

	public String getCardName() {
		return cardName;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void describe() {
		System.out.println(cardName + " of " + suit + ": Value = " + value);
	}

}
