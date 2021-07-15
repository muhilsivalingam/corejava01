package week1.day2;

public class Palindrome {

	public static void main(String[] args)
	{
		String a="civic";
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			
				rev=rev+a.charAt(i);
			
			
		}
		
		
		if(a.equalsIgnoreCase(rev))
		{
			System.out.println("palinDrome ");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		/* * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	}

}
