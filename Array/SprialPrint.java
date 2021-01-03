import java.io.*;
import java.util.*;
class SpiralPrint
{
	public static void spiralPrint(int a[][],int r,int c)
	{
		int r1,r2,c1,c2;
		r1=0;
		r2=r-1;
		c1=0;
		c2=c-1;
		while(r1<=r2 && c1<=c2)
		{
			//print first row of remaining rows
			for(int i=c1;i<=c2;i++)
				System.out.print(a[r1][i]);
			r1++;
			//print last column of remaining columns
			for(int i=r1;i<=r2;i++)
				System.out.print(a[i][c2]);
			c2--;
			if(r1<=r2)
			{
				for(int i=c2;i>=c1;i--)
					System.out.print(a[r2][i]);
				r2--;
			}
			if(c1<=c2)
			{
				for(int i=r2;i>=r1;i--)
					System.out.print(a[i][c1]);
				c1++;
			}
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r,c;
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		spiralPrint(a,r,c);
	}
}