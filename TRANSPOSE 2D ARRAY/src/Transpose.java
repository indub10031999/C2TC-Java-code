import java.util.*;
public class Transpose 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num of rows:\n");
		int row=sc.nextInt();
		System.out.println("enter num of columns:\n");
		int col=sc.nextInt();
		int arr[][]=new int[10][10];
		System.out.println("enter elements of matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements in original matrix are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		int brr[][]=new int[10][10];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				brr[j][i]=arr[i][j];
			}
		}
		System.out.println("after transposing the elements are...");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(brr[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
