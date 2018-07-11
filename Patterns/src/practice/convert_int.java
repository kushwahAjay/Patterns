package practice;

public class convert_int
{
	public static void main(String[] args)
	{

	

		String s= "1235";
		int n=0;
	
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
			//System.out.println(s.charAt(i));
				n=n*10+s.charAt(i)-48;
			
			
			}
		}
		System.out.println(n);
	}
}