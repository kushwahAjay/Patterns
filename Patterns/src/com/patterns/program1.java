package com.patterns;

public class program1
{
	public static void main(String[] args) 
	{ 
		int lineCount=5;
		int starCount=1;
		for(int i=1;i<=lineCount;i++)
		{
			for(int j=1;j<=starCount;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starCount++;
		}
		
	}

}
