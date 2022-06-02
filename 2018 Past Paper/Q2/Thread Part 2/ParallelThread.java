package ques02_b;

public class ParallelThread implements Runnable{
	
	private Calculation myCalc;
	private int start;
	private int end;
	
	public ParallelThread(Calculation myCalc, int start, int end) {
		super();
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}
	

	@Override
	public void run() {
		
		synchronized(ParallelThread.class) {
			myCalc.Factorial(start, end);
		}
		
	}
}
