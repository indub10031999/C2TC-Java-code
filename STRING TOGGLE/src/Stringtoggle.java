import java.util.Scanner;
public class Stringtoggle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to be toggled:");
		String str=sc.nextLine();
		StringBuffer an=new StringBuffer(str);
		int str_length=an.length();
		for(int i=0;i<str_length;i++)
		{
			char c = an.charAt(i);
			if(c>='A'&& c<='Z')
			{
				int temp=c-'A';
				c=(char)('a'+temp);
			}
			else if(c>'a'&&c<='z')
			{
				int temp=c-'a';
				c=(char)('A'+temp);
			}
			an.setCharAt(i, c);
			
			
		}
        System.out.println(an);
	}

}
