package Singleton;

public class ThreadSafeSingleton {
	
	// private field that refers to the object
	private static ThreadSafeSingleton obj;
	
	private ThreadSafeSingleton() {
		// constructor of the SingletonExample class
	}
	
	public static synchronized ThreadSafeSingleton obj() {
		
		if(obj == null) {
			obj = new ThreadSafeSingleton(); 
		}
		return obj;
	}
}

/*Above implementation works fine and provides thread-safety
but it reduces the performance because of the cost associated with the synchronized method, 
although we need it only for the first few threads who might create the separate instances*/