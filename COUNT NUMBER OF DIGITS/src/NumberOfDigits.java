import java.util.Scanner;
public class NumberOfDigits 
{ 
	int count=0;
	int count_digit(int num)
	{
		if(num!=0)
		{
			count++;
			count_digit(num/10);
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num:");
		int num=sc.nextInt();
		NumberOfDigits obj=new NumberOfDigits();
		System.out.println("num of digits in given num is:"+obj.count_digit(num));
		sc.close();
	}

}
