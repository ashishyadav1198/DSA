import java.util.*;
class InversionCount
{
	static int mergeSort(int a[],int l,int r)
	{
		int count=0;
		if(l<r)	
		{
			int mid=(l+r)/2;
			count+=mergeSort(a,l,mid);
			count+=mergeSort(a,mid+1,r);
			count+=merge(a,l,mid,r);
		}
		return count;
	}
	static int merge(int a[],int l,int mid,int r)
	{
		int left[]=Arrays.copyOfRange(a,l,mid+1);
		int right[]=Arrays.copyOfRange(a,mid+1,r+1);
		int i=0;
		int j=0;
		int k=l;
		int count=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
				a[k++]=left[i++];
			else
			{
				a[k++]=right[j++];
				count+=mid+1-i;
			}
		}
		while(i<left.length)
			a[k++]=left[i++];
		while(j<right.length)
			a[k++]=right[j++];
		return count;
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
			System.out.println(mergeSort(a,0,n-1));
			for(int k=0;k<n;k++)
				 System.out.println(a[k]);
		}
	}
}