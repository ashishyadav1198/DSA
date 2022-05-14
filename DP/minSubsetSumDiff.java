/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   static void minDiff(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) 
            sum += a[i];
        boolean dp[][] = new boolean[n+1][sum+1];
        // no element in Array
        for (int i = 0; i <= sum; i++) 
            dp[0][i] = false;
        // we have to make empty subset
        for (int i = 0; i <= n; i++) 
            dp[i][0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= sum; j++) {
                if (a[i-1] <= j) {
                    dp[i][j] = dp[i-1][j-a[i-1]] || dp[i-1][j];
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i <= sum / 2; i++) {
            if (dp[n][i] == true) {
                if (sum - 2 * i < diff) 
                // here the max value of i can't be greter than sum / 2 so it will always be possitive
                // eg if sum = 18 then 18 - 2 * 9 = 0
                    diff = sum - 2 * i;
            }
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.print(diff);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		minDiff(new int[]{2,3,5,7}, 4);
	}
}
