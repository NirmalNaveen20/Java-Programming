package ques02;


public class CountDown extends Thread{
	
	 public void  run() {
		 //synchronized(CountDown.class) { //Lock
			 for(int i = 0; i < 10; i++) {
				 System.out.println(i+1);
				 try {
					sleep(1000); // sleep ekedi try catch eka must
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
		 //}
	 }
}
