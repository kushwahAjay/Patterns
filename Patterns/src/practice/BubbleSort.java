package practice;

public class BubbleSort {

	public static void main(String[] args)
	{
		int a[]={4,2,7,4,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				
				
				if(a[i]<a[j])
				{
					int t= a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			System.out.println(a[i]);
		}
	}

}
