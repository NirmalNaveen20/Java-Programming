package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		listGenericTotal(addElementGenericArray());
	}
	
	//Add the elements to the array list
	public static List<Integer> addElementGenericArray(){
		List<Integer> list = new ArrayList<Integer>(); //Array List object
		
		Scanner sc = new Scanner(System.in);
		
		if(list.isEmpty() == true) {
			System.out.println("List is empty..");
		}
		
		System.out.println("Please enter values for the list");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter value: " + (i + 1) );
			list.add(sc.nextInt());
		}
		return list;
	}
	
	//Getting the total
	//Travesing through the list
	public static void listGenericTotal(List<Integer> list) {
		int total = 0;
		int i = 0;
		for(Integer x : list) {
			total += x; 
			System.out.println("Value : " + (i + 1) + ":"+ x);
			i++;
		}
		System.out.println("Total is : " + total);
	}
}
