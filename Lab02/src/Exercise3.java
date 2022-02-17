import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		
		double height, width, length, volume;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length Value:");
        length = sc.nextDouble();
        
        System.out.println("Enter Width Value:");
        width = sc.nextDouble();
        
        System.out.println("Enter Height Value:");
        height = sc.nextDouble();
        
        volume = length * width * height;
        
        System.out.println("Volume of Cube is: " + volume);
        
	}
}
