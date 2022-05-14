import java.io.*;
import java.util.*;
class OddOccuredNumber
{
	static int find(int a[],int n)
	{
		int temp=a[0];
		for(int i=1;i<n;i++)
			temp=temp^a[i];
		return temp;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=sc.nextInt();
			System.out.println(find(a,n));
		}
	}
}