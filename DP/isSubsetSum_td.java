
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    static boolean isSubsetSum(int a[], int n, int sum) {
        // initialization for the base conditions
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i = 1; i <= sum; i++) 
            dp[0][i] = false;
        for (int i = 0; i <= n; i++) 
            dp[i][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                // if item is grater than sum we will not include it
                if (a[i-1] > sum)
                    dp[i][j] = dp[i-1][j];
                // if item is less than or equal to sum then we have two choices either include or not
                else 
                    dp[i][j] = dp[i-1][j-a[i-1]] || dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    a[i] = sc.nextInt();
		}
		System.out.println(isSubsetSum(a, n, sum));
	}
}
