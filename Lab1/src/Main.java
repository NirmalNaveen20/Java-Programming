import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		
		//Exercise 1
		System.out.println("Hello World!");
		System.out.println("It's been nice knowing you.");
		System.out.println("Goodbye World\n");
		
		//Exercise 2
		System.out.println("==================================");
		System.out.println("=\tStudent Information\t =");
		System.out.println("==================================");
		System.out.println("=Name\t : ARDP Ranasignhe\t =");
		System.out.println("=Reg No\t : DIS\\08\\M4\\1234\t =");
		System.out.println("=Address : Malabe\t\t =");
		System.out.println("==================================\n");
		
		//Exercise 3
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = input.nextInt();
		if(age > 18) {
			System.out.println("Adult");
		} 
		else {
			System.out.println("Child");
		}
		
		System.out.println("\n"); */
		
		
		//Exercise 4
		/*System.out.println("Enter weekday number : ");
		int weekday = input.nextInt();
		switch(weekday) {
		case 1:
			System.out.println("Value of the day: " + weekday);
			System.out.println("Day of the week : Monday");
			System.out.println("Good Bye!");
			break;
		case 2:
			System.out.println("Value of the day: " + weekday);
			System.out.println("Day of the week : Tuesday");
			System.out.println("Good Bye!");
			break;
		case 3:
			System.out.println("Value of the day: " + weekday);
			System.out.println("Day of the week : Wednesday");
			System.out.println("Good Bye!");
			break;
		case 4:
			System.out.println("Value of the day: " + weekday);
			System.out.println("Day of the week : Thursday");
			System.out.println("Good Bye!");
			break;
		case 5:
			System.out.println("Value of the day: " + weekday);
			System.out.println("Day of the week : Friday");
			System.out.println("Good Bye!");
			break;
		case 6:
			System.out.println("Value of the day: " + weekday);
			System.out.println("Day of the week : Saturday");
			System.out.println("Good Bye!");
			break;
		case 7:
			System.out.println("Value of the day: " + weekday);
			System.out.println("Day of the week : Sunday");
			System.out.println("Good Bye!");
			break;
		default:
            System.out.println("Please enter weekday number between 1-7.");
		}*/
		
		//Exercise 5
		/* Using While loop */
		int x = 0, y;	
			
		while(x < 5)
		{
			y = 0;
			while(y < 5)
			{
				System.out.print("*"); 
				y++;
			}
			x++;
			System.out.print("\n"); 	
		}
		
		/* Using For Loop */
		int i, j, row = 5;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();
		}
		
		//Exercise 7
		System.out.println("Enter number 1: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = input.nextInt();
		int total = num1 + num2;
		float avg = total / 2;
		System.out.println("Sum = " + num1 +"+"+ num2 + "=" + total);
		System.out.println("Average of " + total + " = " + avg);
	}
}
