public class Car extends Item{

  private String model;
  private String type;

  public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}

  @Override
	public void Display() {
		super.Display();
		System.out.println("Car model: " + this.model);
		System.out.println("Car type: " + this.type);
	}
  
}