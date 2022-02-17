
public class Exercise1 {
	public static void main(String[] args) {
		int miles = 26;
		int yards = 385;
		double kilometers;
		
		kilometers = (yards/1760.0 + miles) * 1.609;
		System.out.println("Kilometers: " + kilometers + "KM");
	}
}
