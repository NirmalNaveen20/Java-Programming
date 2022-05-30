package Abstract_Factory;

public class Client {
	
	public static void main(String[] args) {
		FactoryProducer ob = new FactoryProducer();
		
		AbstractFactory chicken = ob.createPizza("Chicken");
		Chicken mychickenchoice= chicken.createChicken("Thanduri");
		mychickenchoice.serveChicken();
		
		AbstractFactory dought = ob.createPizza("Dought");
		Dought myChickenchoice = dought.creatDought("thick");
		myChickenchoice.serveDought();
		
	}
}

