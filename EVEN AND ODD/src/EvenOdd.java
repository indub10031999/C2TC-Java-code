import java.util.*;
public class EvenOdd {
	static boolean isEven(int n)
	{
		boolean even_no=true;
		for(int i=1;i<=n;i++)
			even_no=!even_no;
		return even_no;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int n=sc.nextInt();
		if(isEven(n))
			System.out.println("even\n");
		else
			System.out.println("odd\n");
		

	}

}
