import java.io.*;
import java.util.*;
class CandyPriority
{
	 static long candies(int n, int[] arr) {
        int[] l = new int[n];
        int[] r = new int[n];
        for(int i=0;i<n;i++) {
            l[i]=1;
            r[i]=1;
        }
        for(int i=1;i<n;i++) {
            if(arr[i]>arr[i-1])
                l[i]=l[i-1]+1;
        }
        for(int i=n-2;i>=0;i--) {
            if(arr[i]>arr[i+1])
                r[i]=r[i+1]+1;
        }
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.max(l[i],r[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(l[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(r[i]+" ");
        }
        return sum;
    }
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<n;i++)
    		a[i]=sc.nextInt();
    	System.out.println(candies(n,a));
    }

}