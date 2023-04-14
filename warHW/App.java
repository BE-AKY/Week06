package warHW;

public class App {

	public static void main(String[] args) {

		//Instantiates players
		Player player1 = new Player("Mario");	
		Player player2 = new Player("Bowser");
		
		
		//Instantiate a deck
		Deck newDeck = new Deck();		
		
		//Shuffles deck
		newDeck.shuffle();	
		
		
		//Distributes 26 cards to each player
		for(int i = 1; i <= 26; i++){ 		
			player1.hand.add(newDeck.draw()); 
			player2.hand.add(newDeck.draw());
		}
		
		
		player1.describe();	
		System.out.println("--------------------------------");
		player2.describe();	
		System.out.println("--------------------------------");
		
		
		for (int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
		
			
		//Compares Final Scores	
			if (player1Card.getValue() > player2Card.getValue()) {	
				player1.incrementScore();
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();

			} 
			
		}  
			
		if (player1.score > player2.score) {
			System.out.println(player1.name + "'s " + "final score is: " + player1.score);
			System.out.println(player2.name + "'s " + "final score is: "+ player2.score);
			System.out.println(player1.name + " is the winner! Woo hoo!");
		} else if (player1.score < player2.score) {
			System.out.println(player1.name + "'s " + "final score is: " + player1.score);
			System.out.println(player2.name + "'s " + "final score is: "+ player2.score);
			System.out.println(player2.name + " is the winner! >:D");
		} else {
			System.out.println(player1.name + "'s " + "final score is: " + player1.score);
			System.out.println(player2.name + "'s " + "final score is: "+ player2.score);
			System.out.println("It's a draw!");
	
		}

	}

}
