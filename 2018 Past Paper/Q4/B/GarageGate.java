package ques04_b;

public class GarageGate {
	
	private String description;

	public GarageGate(String description) {
		super();
		this.description = description;
	}
	
	public void open() {
		System.out.println(description + " Gate Open");
	}
	
	public void close() {
		System.out.println(description + " Gate Close");
	}
	
}
