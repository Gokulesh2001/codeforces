package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class DoNotBeDistracted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
		 while(t-->0) {
	    	  int n=sc.nextInt();
	    	  sc.nextLine();
	    	  String str=sc.nextLine();
	    	  boolean i=solve(n,str);
	    	  
	    		  System.out.println(i?"YES":"NO");
	    	 
		 }
	}
	static boolean solve(int n,String str) {
		HashSet<Character> set=new HashSet<>();
		
		for(int i=0;i<str.length();) {
			
			char c=str.charAt(i);
			if(set.contains(c)) {
				return false;
			}
			while(i<str.length() && str.charAt(i)==c) {
				i++;
			}
			set.add(c);
		}
		return true;
 }
}
