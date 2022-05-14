import java.io.*;
import java.util.*;
class BirthdayCake
{
	private static int show(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{	int count=0;
			if(a[i]!=n)
			{
				//System.out.println(a[i]);
				count++;
			}
			return count;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(show(a,n));
	}
}
