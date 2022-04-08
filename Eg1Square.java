package patterPrintProg;

public class Eg1Square {
	
	public static void main(String args[])
	{
		
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		//1. outer loop is for row 
		//2. Inner for loop is for Colom.
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}
