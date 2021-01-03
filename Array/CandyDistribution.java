import java.io.*;
import java.util.*;
class CandyDistribution
{
	static void printCandy(int n,int k)
	{
		int a[]=new int[k];
		for(int i=0;i<k;i++)
			a[i]=0;
		int d=1;
		for(int i=0;i<k;i++)
		{
			if(d>=n)
			{
				a[i]+=n;
				n-=d;
				d++;
				break;
			}
			a[i]+=d;
			n-=d;
			d++;
			if(i==k-1) i=-1;
		}
		for(int i=0;i<k;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			printCandy(n,k);
		}
	}
}