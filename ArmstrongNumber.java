package week1.day1;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number=153;
		int calculated=0;
		int original=number;
		while(number>0)
		{
			int remainder=number%10;
			number=number/10;
			calculated=calculated+(remainder*remainder*remainder);
			
		}
		if(original==calculated)
		{
			System.out.println("it is an armstrong number");
			
		}
		else
		{
			System.out.println("it is not an armstrong number");
		}
			
		}

}
