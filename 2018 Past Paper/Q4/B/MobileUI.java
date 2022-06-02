package ques04_b;

public class MobileUI {
	
	private Command commands[];

	public MobileUI() {
		super();
		commands = new Command[6];
	}
	
	public void setCommand(int index, Command comObj) {
		commands[index] = comObj;
	}
	
	public void commandPressed(int index) {
		commands[index].execute();
	}
	
}
