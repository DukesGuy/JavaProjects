package week6;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck.shuffle();
		
		dealCards(deck, player1, player2);
		playWar(player1, player2);
		findWinner(player1, player2);
	}	

	
	// Deal cards evenly between Players 1 & 2
	
	private static void dealCards(Deck deck, Player player1, Player player2) {
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
	}
	
	
	// Take turns playing each card in hand
	
	private static void playWar(Player player1, Player player2) {
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
			} else if (card2.getValue() > card1.getValue()) {
				player2.incrementScore();
			} 
		}
	}
	
	
	// Determine winner based on score
	
	private static void findWinner(Player player1, Player player2) {
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Final Score: " + player1.getScore() + " to " 
					+ player2.getScore() + " \nWinner: Player 1");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Final Score: " + player1.getScore() + " to " 
					+ player2.getScore() + " \nWinner: Player 2");
		} else {
			System.out.println("Final Score: " + player1.getScore() + " to " 
					+ player2.getScore() + " \nWinner: Draw");
		}
	}

}
