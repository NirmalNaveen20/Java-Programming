package Factory;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PizzaFactory ob = new PizzaFactory();
		System.out.println("1.Chicken\n2.Veggie\n3.Cheese\n");
		System.out.println("Enter your choice: ");
		String type = sc.next();
		
		Pizza pizza = ob.createPizza(type);
		pizza.servePizza();
		
	}
}
