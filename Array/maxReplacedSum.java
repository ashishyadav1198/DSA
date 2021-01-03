import java.io.*;
import java.util.*;
class MaxReplacedSum
{
	static int replaceSum(int a[],int n)
	{
		int max_idx=0;
		for(int i=1;i<n;i++)
			if(a[i]>a[max_idx])
				max_idx=i;
		int i=max_idx-1;
		int j=max_idx+1;
		int num=a[max_idx];
		int sum=0;
		while(i>=0 || j<n)
		{
			if(i>=0 && j<n)
			{
				int temp= (a[i]>a[j] ? i-- : j++);
				num+=a[temp];
				sum+=num;
			}
			else if(i>=0)
			{
				num+=a[i--];
				sum+=num;
			}
			else
			{
				num+=a[j++];
				sum+=num;
			}
		}
		return sum;
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
			System.out.println(replaceSum(a,n));
		}
	}
}