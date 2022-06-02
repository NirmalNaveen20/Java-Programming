package ques04_b;

public class OvenOn implements Command {

	private Oven ovenObj;
	
	public OvenOn(Oven ovenObj) {
		super();
		this.ovenObj = ovenObj;
	}


	@Override
	public void execute() {
		
		ovenObj.on();
	}

}
