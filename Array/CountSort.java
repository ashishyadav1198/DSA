import java.io.*;
import java.util.*;
class CountSort
{
	private static int range=255;
	private static void sort(int a[],int n)
	{
		char[] count=new char[256];
		int[] output=new int[n];
		for(int i=0;i<256;i++)
			count[i]=0;
		for(int i=0;i<n;i++) //count frequency of each keys
			count[a[i]]++;
		for(int i=1;i<256;i++) //each element contains the previous sum 
			count[i]+=count[i-1];
		for(int i=255;i>=1;i--)	//each element contains how many elements are coming earlier in array than this, means contains position
			count[i]=count[i-1];
		count[0]=0;
		for(int i=0;i<n;i++)	//pick the starting position for frst time and increments for next time
			output[count[a[i]]++]=a[i];
		for(int i=0;i<n;i++)
			a[i]=output[i];
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sort(a,n);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}