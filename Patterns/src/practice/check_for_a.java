package practice;

public class check_for_a 
{
	public static void main(String[] args)
	{
	
		String s="malayalam";
		int c = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				c++;
			}
		}
		System.out.println(c);
	}
}


