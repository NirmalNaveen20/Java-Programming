package Singleton;

public class Locking {
	
	// private field that refers to the object
	private static Locking obj;
	
	private Locking() {
		// constructor of the SingletonExample class
	}
	
	public static Locking getUsingDoubleLocking() {
		
		if(obj == null) {
			synchronized (Locking.class) {
				if(obj == null) {
					obj = new Locking(); 
				}
			}
		}
		return obj;
	}
}