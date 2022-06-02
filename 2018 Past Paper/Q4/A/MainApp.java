package ques04_a;

public class MainApp {
	
	public static void main(String[] args) {
		
		CreditCard card1 = CreditCard.getInstance();
		CreditCard card2 = CreditCard.getInstance();
		
		System.out.println(card1.validate("IT12345678901234", 3));
		System.out.println(card1.validate("IT12345678901234", 7));
		System.out.println(card1.validate("IT12345678901234", 15));
	}
}
