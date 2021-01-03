import java.util.regex.*;
import java.util.*;
class Regex {
	public static void main(String args[]) {
		Pattern pat = Pattern.compile("ab+");
		Matcher mat = pat.matcher("fjjdabbbffeeabaab");
		System.out.println(mat.matchGroup());
	}
}