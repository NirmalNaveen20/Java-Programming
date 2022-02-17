import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;

public class Exercise4 {
	public static void main(String[] args)throws IOException {		
		
		double height, width, length, volume;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Length Value:");
        //length = sc.nextDouble();
		length = Double.parseDouble(reader.readLine());
        
        System.out.println("Enter Width Value:");
        width = Double.parseDouble(reader.readLine());
        
        System.out.println("Enter Height Value:");
        height = Double.parseDouble(reader.readLine());
        
        volume = length * width * height;
        
        System.out.println("Volume of Cube is: " + volume);
		
	}
}
