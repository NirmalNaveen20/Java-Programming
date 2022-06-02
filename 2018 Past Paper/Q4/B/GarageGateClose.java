package ques04_b;

public class GarageGateClose implements Command {

	
	private GarageGate ggObj;
	
	public GarageGateClose(GarageGate ggObj) {
		super();
		this.ggObj = ggObj;
	}


	@Override
	public void execute() {
		
		ggObj.close();
	}

}
