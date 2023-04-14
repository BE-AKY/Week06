package warHW;

import java.util.ArrayList;
import java.util.List;


public class Player {
	
	String name;
	int score;
	List<Card> hand = new ArrayList<Card>(); 
	
	
//CREATES PLAYER:	
	public Player(String name) {
		this.name = name;	
		this.score = 0; 
			
		}	
	
	
//DESCRIBES PLAYER'S HAND:
	public void describe() {
		System.out.println("\nGame Start! Player " + name + "'s Hand:\n");
			for(Card card : hand) {
				card.describe();	
			}		
			
	}
//FLIPS CARD:
	public Card flip() {
		return hand.remove(0);
		
	}
	
//DRAWS CARD:
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);	
	}
	
//INCREMENTS SCORE:
	public void incrementScore() {
		this.score++; 	
	
	}
}
