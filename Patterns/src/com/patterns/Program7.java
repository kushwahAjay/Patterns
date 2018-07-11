package com.patterns;

public class Program7
{
	public static void main(String[] args)
	{
		int lineCount=9;
		int starCount=1;
		int mid= (lineCount+1)/2;
		//System.out.println(mid);
		
		for(int i=1;i<=lineCount;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			if(i<mid)
			starCount++;
			else 
				starCount--;
			
			
		}
	}

}
