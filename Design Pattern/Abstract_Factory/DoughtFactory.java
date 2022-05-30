package Abstract_Factory;

public class DoughtFactory extends AbstractFactory{
	
	public Dought createDought(String msg) {
		if(msg.equalsIgnoreCase("Double")) {
			return new DoubleLayerDought();
		}
		if(msg.equalsIgnoreCase("Thin")) {
			return new ThinDought();
		}
		if(msg.equalsIgnoreCase("Thick")) {
			return new ThickDought();
		}
		else{
			return null;
		}
		
	}

	@Override
	public Chicken createChicken(String msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dought creatDought(String msg) {
		// TODO Auto-generated method stub
		return null;
	}
}
