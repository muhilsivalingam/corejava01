package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int input=29;
		boolean flag=false;
		for(int i=2;i<input/2;i++)
		{
			int remainder=input%i;
			if(remainder==0)
			{
				flag=true;
				break;
			}
		}
			if(flag==false)
			{
				System.out.println("the number is a prime number");
			}
			else if(flag==true)
			{
				System.out.println("the number is not a prime number");
			}
		
	}

}
