package practice;

public class string_num_seperation
{
	public static void main(String[] args)
	{
		String s= "reshma123s5";
		int n=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				//System.out.println(s.charAt(i));
				n=n*10+s.charAt(i)-48;
				
				
			}
			else if(n!=0)
			{
				System.out.println(n);
				n=0;
			}
		}
		System.out.println(n);
	}
}
