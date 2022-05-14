import java.io.*;
import java.util.*;
class Color
{
	public static boolean colorMatch(char a[][],int n)
	{
		boolean flag=false;
		if(n<3)
			return false;
		for(int i=0;i<n-2;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[i][j]==a[i+1][j] && a[i+1][j]==a[i+2][j] && a[i+2][j]==a[i+2][j+1])
					flag=true;
			}
		}
		return flag;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		char a[][]=new char[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				String temp=sc.next();
				a[i][j]=temp.charAt(0);
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Answer is "+colorMatch(a,n));
			
	}
}