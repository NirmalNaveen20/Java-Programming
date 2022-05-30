package Factory;
//Encapsulation the object creation
public class PizzaFactory {
	
	public Pizza createPizza(String msg){
		if(msg.equalsIgnoreCase("Veggie")) {
			return new VeggiePizza();
		}
		if(msg.equalsIgnoreCase("Chicken")) {
			return new ChickenPizza();
		}
		if(msg.equalsIgnoreCase("Cheese")) {
			return new CheesePizza();
		}
		else {
			return null;
		}
	}
}
