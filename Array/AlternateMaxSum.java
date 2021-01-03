import java.io.*;
import java.util.*;
class AlternateMaxSum{
	private static boolean sign(int a) { return a>0; }
	private static int maxSum(int a[],int n) {
		int sum=0;
		int i=0;
		int maxi=0;
		while(i<n) {
			maxi=i;
			int j=i;
			while(j<n-1 && sign(a[i])==sign(a[j+1])) {
				if(a[maxi]<a[j+1])
					maxi=j+1;
				j++;
			}
			sum+=a[maxi];
			System.out.print(a[maxi]+" ");
			i=j+1;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println(maxSum(a,n));
	}
}