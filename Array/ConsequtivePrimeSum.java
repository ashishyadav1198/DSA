import java.io.*;
import java.util.*;
class ConsequtivePrimeSum {
	static int psc(int n) {
		int isPrime[] = new int[n+1];
		// mark all odd number as prime coz there is a possibility
		isPrime[2] = 1;
		for (int i = 3; i <= n; i += 2) {
			isPrime[i] = 1;
		}
		// mark all multiple of prime number as not prime
		for (int i = 3; i * i <= n; i += 2) {
			if (isPrime[i] == 1) {
				for (int j = i * i; j <= n; j += i) 
					isPrime[j] = 0;
			}
		}
		int count = 0;
		for (int i = 5; i <= n; i += 2) {
			if (isPrime[i] == 1) {
				int temp = 2;
				int j = 3;
				while (temp < i) {
					if (isPrime[j] == 1) 
						temp += j;
					j += 2;
				}
				if (temp == i) count++;
			}
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(psc(n));
	}
}