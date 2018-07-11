package practice;

public class Count_Words 
{
	public static void main(String[] args)
	{
			String s="its me    reshma  here";
			int c=1;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
				{
					c++;
					
					
				}
			}
			System.out.println(c);                                   
		
	}
}
