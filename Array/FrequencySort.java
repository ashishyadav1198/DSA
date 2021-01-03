/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = sc.nextInt();
		while (n-- > 0) {
		    list.add(sc.nextInt());
		}
	    System.out.println(list);
	    for (int i : list) {
	        if (map.get(i) == null) {
	            map.put(i, 1);
	        }
	        else
	            map.put(i, map.get(i) + 1);
	    }
	    System.out.println(map);
	    Collections.sort(list, (a, b) -> {
	        if (map.get(b) > map.get(a)) {
	            return 1;
	        }
	        else if (map.get(b) < map.get(a))
	            return -1;
	        // if frequency is same then sort by element's value
	        return a - b;
	        
	    });
	    System.out.println(list);
	}
}
