package Singleton;

public class Singleton {
	
	// private field that refers to the object
	private static Singleton obj;
	
	private Singleton() {
		// constructor of the SingletonExample class
	}
	
	public static Singleton obj() {
		
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
	
}

/*The above implementation works fine in case of the single-threaded environment 
but when it comes to multithreaded systems, it can cause issues 
if multiple threads are inside the if condition at the same time. 
It will destroy the singleton pattern and both threads will get the different instances of the singleton class.*/