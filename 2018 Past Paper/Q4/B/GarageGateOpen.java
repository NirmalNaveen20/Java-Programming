package ques04_b;

public class GarageGateOpen implements Command {

	private GarageGate ggObj;
	
	public GarageGateOpen(GarageGate ggObj) {
		super();
		this.ggObj = ggObj;
	}

	@Override
	public void execute() {
		
		ggObj.open();
	}

}
