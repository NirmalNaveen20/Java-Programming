package ques04_a;

public class CreditCard {
	
	private static CreditCard card = null;
	
	private CreditCard() {};
	
	public static CreditCard getInstance() {
		
		if(card == null) {
			card = new CreditCard();
			System.out.println("new Object Created"); //Optional
		}
		else {
			System.out.println("Returning existing object");
		}
		return card;
	}
	
	public boolean validate(String cardNo, int code) {
		
		int remainder = code % 3;
		
		if(cardNo.length() == 16 && remainder == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
