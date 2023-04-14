package warHW;

public class Card {

	String name;
	String suit; //added suit field 
	int value;
	

//METHODS:	
	Card(String name, String suit, int value) { 
		this.name = name;
		this.suit = suit;
		this.value = value;		
	}	
		
		
//GETTERS & SETTERS		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

//END GETTERS & SETTERS	
	


//DESCRIBES CARD:
	public void describe() {
		System.out.println(this.name + " of " + this.suit + " - " + this.value);

	}	
}
