package Abstract_Factory;

public class ChickenFactory extends AbstractFactory{
	
	public Chicken createChicken(String msg) {
		if(msg.equalsIgnoreCase("Masala")) {
			return new MasalaChicken();
		}
		if(msg.equalsIgnoreCase("Develled")) {
			return new DevelledChicken();
		}
		if(msg.equalsIgnoreCase("Thanduri")) {
			return new ThanduriChicken();
		}
		else{
			return null;
		}
		
	}

	@Override
	public Dought creatDought(String msg) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
