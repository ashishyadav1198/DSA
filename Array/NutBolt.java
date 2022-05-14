/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Nutbolt{
    static void matchedNuts(char nuts[],char bolts[],int n)
    {
        char a[]={'!','#','$','%','&','*','@','^','~'};
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
            map.put(nuts[i],1);
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(bolts[i]))
                map.put(bolts[i],map.get(bolts[i])+1);
        }
        String res="";
        for(int i=0;i<9;i++)
            if(map.containsKey(a[i]) && map.get(a[i])>1)
                res+=a[i]+" ";
        System.out.println(res);
        System.out.print(res);
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int n=sc.nextInt();
    	    char nuts[]=new char[n];
    	    char bolts[]=new char[n];
    	    for(int j=0;j<n;j++)
    	        nuts[j]=sc.next().charAt(0);
    	 	for(int j=0;j<n;j++)
    	        bolts[j]=sc.next().charAt(0);
    	    matchedNuts(nuts,bolts,n);
	    }
	}
}