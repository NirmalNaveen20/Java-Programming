package Ex3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {
	
	public static void main(String[] args) {
		
		//Set demonstration using HashSet constructor
		Set studentHeight = new HashSet();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter Height: " + (i+1)+":");
			studentHeight.add(sc.nextInt());
		}
		
		//Loop through a HashSet
		//Iterating the set elements using for each loop
		for(Object object : studentHeight) {
			System.out.println(object);
		}
		
	}
}
