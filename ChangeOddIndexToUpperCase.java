package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		
		  
		  String test = "changeme";
		  char[] b=test.toCharArray();
		
		  for(int i=0;i<test.length();i++)
		  {
			 
			  if(i%2==1)
			  {
				  b[i]=Character.toUpperCase(b[i]);
			  }
			  
			  System.out.print(b[i]);
		  }
		 
		  
		 
		/* * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */

	}

}
