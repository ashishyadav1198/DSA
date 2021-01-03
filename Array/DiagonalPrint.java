//diagonal order of a m*n matrix
import java.io.*;
import java.util.*;
class DiagonalPrint
{
	public static void print(int a[][],int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=i,k=0;j>=0 && k<c;j--,k++)
			{
				System.out.print(a[j][k]+" ");
			}
			System.out.println();
		}
		for(int i=1;i<c;i++)
		{
			for(int j=r-1,k=i;j>=0 && k<c;j--,k++)
				System.out.print(a[j][k]+" ");
			System.out.println();
		}
	}	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		}
		print(a,r,c);
	}
}