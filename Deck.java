package week6;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<String> cardType = List.of("Two","Three","Four","Five","Six",
			"Seven","Eight","Nine","Ten","Jack","Queen","King","Ace");
	
	private List<String> suits = List.of("Diamonds","Spades","Hearts","Clubs");
	
	private List<Card> cards = new LinkedList<>();
	
	public List<Card> getCards() {
		return cards;
	}
	
	
	// Create 52 card deck with every card type and suit with associated rank
	
	public Deck() {
		for (int i = 0; i < cardType.size(); i++) {
			String cardName = cardType.get(i);
			int rank = i + 1;
			
			for(String suit : suits) {
				cards.add(new Card(cardName, suit, rank));
			}
		}
	}
	
	
	// Randomize order of cards in deck
	
	public void shuffle() {
		Random random = new Random();
		List<Card> tempCards = new LinkedList<>(cards);
		
		cards.clear();
		
		while (!tempCards.isEmpty()) {
			int pos = random.nextInt(tempCards.size());
			cards.add(tempCards.remove(pos));
		}
	}
	
	
	// Take first card off top of deck and remove from deck 
	
	public void draw() {
		cards.get(0);
		cards.remove(0);
	}

}
