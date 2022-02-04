import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
	//Exercise 3
	Scanner input = new Scanner(System.in);
	System.out.print("Enter age: ");
	int age = input.nextInt();
	if(age > 18) {
		System.out.println("Adult");
	} 
	else {
		System.out.println("Child");
	}
			
	System.out.println("\n"); 
	}

}
