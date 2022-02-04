
public class Exercise5 {
	
	public static void main(String[] args) {
	//Exercise 5
	/* Using While loop */
	int x = 0, y;	
		
	while(x < 5)
	{
		y = 0;
		while(y < 5)
		{
			System.out.print("*"); 
			y++;
		}
		x++;
		System.out.print("\n"); 	
	}
	
	/* Using For Loop */
	int i, j, row = 5;       
	//Outer loop work for rows  
	for (i=0; i<row; i++)   
	{  
	//inner loop work for space      
	for (j=row-i; j>1; j--)   
	{  
	//prints space between two stars  
	System.out.print(" ");   
	}   
	//inner loop for columns  
	for (j=0; j<=i; j++ )   
	{   
	//prints star      
	System.out.print("* ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();
	}
	}
}
