import java.util.Scanner;

public class Exercise4 {
	

	public static void main(String[] args) {
	//Exercise 4
	Scanner input = new Scanner(System.in);
	System.out.print("Enter weekday number : ");
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
	}
	}
}
