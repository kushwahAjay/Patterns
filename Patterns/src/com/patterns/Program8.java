package com.patterns;

public class Program8 
{
	public static void main(String[] args)
	{
		int lineCount=5;
		int starCount=1;
		int spaceCount=2;
		int mid= (lineCount+1)/2;
		//System.out.println(mid);
		
		for(int i=1;i<=lineCount;i++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			if(i<mid)
				
			{
				spaceCount--;
				starCount++;
			}
				
			else 
			{
				starCount--;
				spaceCount++;
			}
			
			
			
			
		}
	}

}
