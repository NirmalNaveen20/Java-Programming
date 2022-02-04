import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
	//Exercise 7
	System.out.print("Enter number 1: ");
	Scanner input = new Scanner(System.in);
	int num1 = input.nextInt();
	System.out.print("Enter number 2: ");
	int num2 = input.nextInt();
	int total = num1 + num2;
	float avg = total / 2;
	System.out.println("Sum " + num1 +"+"+ num2 + " = " + total);
	System.out.println("Average of " + total + " = " + avg);
	}
	
}
	
