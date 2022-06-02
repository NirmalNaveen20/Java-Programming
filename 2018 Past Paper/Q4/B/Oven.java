package ques04_b;

public class Oven {
	
	private String name;

	public Oven(String name) {
		super();
		this.name = name;
	}
	
	public void on() {
		System.out.println(name + " Switch on! ");;
	}
	
	public void off() {
		System.out.println(name + " Switch off! ");;
	}
	
}
