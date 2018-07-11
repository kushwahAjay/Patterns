package practice;

public class Count_Repeat_Words
{
	public static void main(String[] args)
	{
		String s = "this apple that apple";
		String[] strArray = s.split(" ");
		int count;
		for(int i =0;i<strArray.length;i++)
		{   
			count=1;
			int j=i+1;
			if(strArray[i]!=" ")
			{
				while(j<strArray.length)
				{
					//System.out.println(strArray[i]+  strArray[j]);
					if(strArray[i].equals(strArray[j]))
					{
						
						count++;
						strArray[j]=" ";
						
					}
					j++;
				}
				System.out.println(strArray[i]+"   presnt   "+ count);
				
			}
			
			
			
			
			
		}
		
		
	}

}
