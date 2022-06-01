package ques02;

public class CalcSum implements Runnable {

	private double sum = 1;
	
	@Override
	public void run() {
		
		synchronized(CalcSum.class) {
			for (int i = 0; i < 100000; i++) {
				sum += i;
			}
			System.out.println("Current Thread: " + Thread.currentThread().getName() + "Sum: " + sum);
		}
		
	}

}
