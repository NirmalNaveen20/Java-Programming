package ques02;

public class MainThreadApp {
	
	public static void main(String[] args) throws InterruptedException {
		
		//extends Thread 
		//extends karala haduwoth 
		// CountDown count1 = new CountDown();
		Thread countDown = new Thread(new CountDown());//another way

		//implements Runnable
		Thread calcSum1 = new Thread(new CalcSum());
		
		Thread calcSum2 = new Thread(new CalcSum());
		
		calcSum1.setName("Black");
		calcSum2.setName("White");
		
		countDown.start();
		countDown.join();
		
		calcSum1.start();
		calcSum2.start();
		
		
	}
}
