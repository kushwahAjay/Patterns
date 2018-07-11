package practice;

public class Array_Sort_Mid
{
	public static void main(String[] args)
	{
		int[] a={1,2,3,4,5};
		int middle,t;
		
		if(a.length%2==0)
		{
			middle= a.length/2;
			
		}
		else 
			middle=a.length/2+1;
		System.out.println(middle);
		for(int i=0;i<middle && middle<a.length;i++)
		{
			t=a[i];
			a[i]=a[middle];
			a[middle]=t;
			middle++;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}
}
