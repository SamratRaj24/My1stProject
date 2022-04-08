package patterPrintProg;

public class Eg3leftRightAngle {
	
	public static void main(String args[])
	{
// 	      *
//	     **
//	    ***
//	   ****
//	  *****

		int Star=1;
		int Space=5;
		
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=Space;j++)
			{
				System.out.print(" ");
			}
		
			for(int k=1;k<=Star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			Space--;
			Star++;
		}
		
	}

}
