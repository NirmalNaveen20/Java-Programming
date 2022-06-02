package ques04_b;

public class MainApp {
	
	public static void main(String[] args) {
		
		MobileUI mobileObj = new MobileUI();
		
		Oven ovObj = new Oven("mainOven");
		GarageGate garageObj = new GarageGate("Garage ");
		
		Command c1 = new OvenOn(ovObj);
		Command c2 = new OvenOff(ovObj);
		Command c3 = new GarageGateOpen(garageObj);
		Command c4 = new GarageGateClose(garageObj);
		
		mobileObj.setCommand(1, c1);
		mobileObj.setCommand(2, c2);
		mobileObj.setCommand(3, c3);
		mobileObj.setCommand(4, c4);
		
		mobileObj.commandPressed(1);
		mobileObj.commandPressed(2);
		mobileObj.commandPressed(3);
		mobileObj.commandPressed(4);
	}
}
