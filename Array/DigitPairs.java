/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int largest(String s) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int value = Character.getNumericValue(s.charAt(i));
            if (value > max)
                max = value;
        }
        return max;
    }
    static int smallest(String s) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int value = Character.getNumericValue(s.charAt(i));
            if (value < min) 
                min = value;
        }
        return min;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    HashMap<Character, Integer> oddMap = new HashMap<>();
	    HashMap<Character, Integer> evenMap = new HashMap<>();
	    for (int i = 0; i < n; i++) {
	        String input = sc.next();
	        int max = largest(input);
	        int min = smallest(input);
	        String res = String.valueOf(7 * min + 11 * max);
	        char key = res.length() >= 3 ? res.charAt(1) : res.charAt(0);
	        if ((i & 1) == 0) {
	            if (evenMap.get(key) == null)
	                evenMap.put(key, 1);
	            else 
	                evenMap.put(key, evenMap.get(key) + 1);
	        } else {
	            if (oddMap.get(key) == null)
	                oddMap.put(key, 1);
	            else 
	                oddMap.put(key, oddMap.get(key) + 1);
	        }
	    }
	    int pairs = 0;
	    for (Map.Entry<Character, Integer> map : oddMap.entrySet()) {
	        if (map.getValue() == 2) 
	            pairs += 1;
	        else if (map.getValue() >= 3) 
	            pairs += 2;
	    }
	    for (Map.Entry<Character, Integer> map : evenMap.entrySet()) {
	        if (map.getValue() == 2) 
	            pairs += 1;
	        else if (map.getValue() >= 3) 
	            pairs += 2;
	    }
	    System.out.println(pairs);
	}
}
