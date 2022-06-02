package ques04_b;

public class OvenOff implements Command {

	private Oven ovenObj;
	
	public OvenOff(Oven ovenObj) {
		super();
		this.ovenObj = ovenObj;
	}


	@Override
	public void execute() {
		
		ovenObj.off();
	}

}
