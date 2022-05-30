package Abstract_Factory;

public class FactoryProducer {
	
	public AbstractFactory createPizza(String msg) {
		if(msg.equalsIgnoreCase("Chicken")) {
			return new ChickenFactory();
		}
		if(msg.equalsIgnoreCase("Dought")) {
			return new DoughtFactory();
		}
		else{
			return null;
		}
		
	}
	
}
