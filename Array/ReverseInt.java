public class ReverseInt {
		public static int rev(int[] a, int n) {
			if( n >= -Math.pow(2,31) && n <= Math.pow(2,31) - 1 )
			{
				boolean flag = true;
				if(n < 0) {
					n = n *-1;
					flag = false;
				}
				int sum=0;
				while(n > 0) {
					sum = sum * 10 + n % 10;
					n / = 10;
				}
				return flag == true ? sum : -sum;
			}
			else 
				return 0;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println(rev(a,n));
		}
}