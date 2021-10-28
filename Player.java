package week6;

import java.util.LinkedList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new LinkedList<>();
	private int score;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void describe() {
		System.out.println(name + " has a score of: " + score);
	}
	
	
	// Removes and returns card in hand
	
	public Card flip() {
		return hand.remove(0);
	}
	
	
	// Draws from deck, adding returned card to hand and removing from deck
	
	public void draw (Deck deck) {
		hand.add(deck.getCards().remove(0));
	}
	
	
	// If card value is larger than opponent's, score goes up by 1 point
	
	public void incrementScore() {
		score += 1;
	}
}
