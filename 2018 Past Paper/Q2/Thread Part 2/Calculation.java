package ques02_b;

public class Calculation {
	
	private double ans = 1;

	public double getAns() {
		return ans;
	}

	public void Factorial(int start, int end) {
		
		System.out.println("Comp start :  " + start + "to end : " + end);
		
		for (int i = start; i <= end; i++) {
			ans = ans * (double)i;
			
		}
	}
	
}
