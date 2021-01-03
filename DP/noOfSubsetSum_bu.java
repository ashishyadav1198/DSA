
// returns true if subset of a given sum exists in the array
// this code is done using memoization (bottom-up approach)

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int noOfSubsetSum(int a[], int n, int sum) {
        int dp[][] = new int[n+1][sum+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                dp[i][j] = -1;
            }
        }
        return noOfSubsetSumRec(a, n, sum, dp);
    }
    
    static int noOfSubsetSumRec(int a[], int n, int sum, int dp[][]) {
        if (sum == 0) 
            return 1;
        else if (n == 0)
            return 0;
        // if result is not already calculated
        
        if (dp[n][sum] == -1) {
            if (a[n-1] > sum) 
                dp[n][sum] = noOfSubsetSumRec(a, n-1, sum, dp);
            else
                dp[n][sum] = noOfSubsetSumRec(a, n-1, sum - a[n-1], dp) + noOfSubsetSumRec(a, n-1, sum, dp);
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
        System.out.println(noOfSubsetSum(a, n, sum));
    }
}
