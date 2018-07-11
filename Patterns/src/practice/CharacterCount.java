package practice;

public class CharacterCount
{
		public static void main(String[] args)
		{
			String s="thiruvananthapuram";
			char[] ch = s.toCharArray();
			int c, j, i;
			for(i=0;i<s.length();i++)
			{
				j=i+1;
				c=1;
				if(ch[i]!=' ')
				{
					while(j<ch.length)
					{
						if(ch[i]==ch[j])
						{
							c++;
							ch[j]=' ';
							
						}
						j++;
					}
					System.out.println(ch[i] +"  is present  "+c);
				}
			}
		}

}
