import java.io.*;
import java.util.*;
class MergeString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean isPossible = true;
		HashMap<Character, Integer> bigMap = new HashMap<>();
		HashMap<Character, Integer> smallMap = new HashMap<>();
		String bigString = sc.next();
		int sizeOfArray = sc.nextInt();
		String arrayOfSmallString[] = new String[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arrayOfSmallString[i] = sc.next();
		}
		
		for (int i = 0; i < bigString.length(); i++) {
			Character c = bigString.charAt(i);
			if (bigMap.get(c) == null) 
				bigMap.put(c, 1);
			else 
				bigMap.put(c, bigMap.get(c) + 1);
		}
		for (int j = 0; j < sizeOfArray; j++) {
			for (int i = 0; i < arrayOfSmallString[j].length(); i++) {
				Character c = arrayOfSmallString[j].charAt(i);
				if (smallMap.get(c) == null) 
					smallMap.put(c, 1);
				else 
					smallMap.put(c, smallMap.get(c) + 1);
			}
		}
		for (Map.Entry<Character, Integer> map : smallMap.entrySet()) {
			if (map.getValue() != bigMap.get(map.getKey())) {
				isPossible = false;
				break;
			}
		}
		int sizeOfBigMap = bigMap.size();
		int sizeOfSmallMap = smallMap.size();
		if (sizeOfBigMap == sizeOfSmallMap && isPossible) {
			System.out.print("YES");
		}
		else 
			System.out.print("NO");
		//System.out.println(bigMap + " " + bigMap.size());
		//System.out.println(smallMap + " " + smallMap.size());
	}
}