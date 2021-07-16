package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		
					String str = "welcome to chennai";
					int count=0;
					char[] ch1=str.toCharArray();
					for(int i=0;i<ch1.length;i++)
					{
						if(ch1[i]=='e')
						{
							count++;
						}
					}
					System.out.println(count);

					
	}

}
