import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		EvenOddNumber num = new EvenOddNumber();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int var = sc.nextInt();
		
		boolean result = num.findEvenOrOdd(var);
		
		if(result == true) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}
}
