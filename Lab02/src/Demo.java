import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		EvenOddNumber num = new EvenOddNumber();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values do yo want to check: ");
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.print("Enter number: ");
			int var = sc.nextInt();
			
			boolean result = num.findEvenOrOdd(var);
			
			if(result == true) {
				System.out.println(var + " is a Even Number\n");
			} else {
				System.out.println(var + " is a Odd Number\n");
			}
		}
		
	}
}
