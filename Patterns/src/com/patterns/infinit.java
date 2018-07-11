package com.patterns;

public class infinit {

	public static void main(String[] args) 
	{
		/*for(; ;)
		{
			System.out.println("1");
		}*/
		
		
		aa: for (int i = 1; i <= 3; i++)
		{
		    	if (i == 1)
		    	continue;
		    	System.out.println("aaaaa");
		   
		    	bb: for (int j = 1; j <= 3; j++) 
		    	{
		    		System.out.println("bb");
		    		if (i == 2 && j == 2) 
		    		{
		            break aa;
		    		}
		        System.out.println(i + " " + j);
		    	}
		}
	}

}
