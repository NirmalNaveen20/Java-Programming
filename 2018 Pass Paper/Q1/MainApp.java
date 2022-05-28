package ques01;

import java.util.ArrayList;
import java.util.Scanner;


public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Item> arrayList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
	
		Book b1 = new Book(1, "book1", 100.5, "Poter", "story", 120);
		
		Book b2 = new Book(2, "book2", 200.2, "Jungle", "novel", 250);
		
		Car c1 = new Car(3, "new", 100000, "Audi", "A1");
		Car c2 = new Car(4, "new", 250000, "BMW", "720LE");
		
		arrayList.add(b1);
		arrayList.add(b2);
		arrayList.add(c1);
		arrayList.add(c2);
		
		for (Item item : arrayList) {
			item.Display();
			System.out.println();
		}
	}

}
