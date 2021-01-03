import java.io.*;
import java.util.*;
class FactorOfThree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		while (testCase-- > 0) {
			int sizeOfArray = sc.nextInt();
			int array[] = new int[sizeOfArray];
			int countOfZero = 0;
			int countOfOne = 0;
			int countOfTwo = 0;
			boolean isPossible = true;
			for (int i = 0; i < sizeOfArray; i++) {
				array[i] = sc.nextInt();
				if (array[i] % 3 == 0) 
					countOfZero ++;
				else if (array[i] % 3 == 1) 
					countOfOne ++;
				else if (array[i] % 3 == 2) 
					countOfTwo ++;
			}
			if ((countOfZero == 0 && countOfOne != 0 && countOfTwo != 0) || countOfZero > countOfTwo + countOfTwo + 1) 
				isPossible = false;
			list.add(isPossible ? "Yes" : "No");
		}
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.println(list.get(i));
		}
		System.out.print(list.get(list.size() - 1));
	}
}