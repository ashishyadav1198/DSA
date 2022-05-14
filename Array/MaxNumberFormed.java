import java.io.*;
import java.util.*;
class MaxNumberFormed
{
	static void cusSort(ArrayList<String> a)
	{
		Comparator<String> obj=new Comparator<String>()
		{
			public int compare(String x,String y)
			{
				String xy=x+y;
				String yx=y+x;
				return xy.compareTo(yx) > 0 ? -1 : 1;
			}
		};
		Collections.sort(a,obj);
	}
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("1");
		a.add("30");
		a.add("3");
		a.add("5");
		a.add("9");
		cusSort(a);
		for(String i:a)
			System.out.print(i);
	}
	
}