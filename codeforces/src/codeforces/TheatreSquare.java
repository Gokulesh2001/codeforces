package codeforces;

import java.util.Scanner;

public class TheatreSquare {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in); 
//		      int t=sc.nextInt();
//			 while(t-->0) {
		    	  long n=sc.nextLong();
		    	  long m=sc.nextLong();
		    	  long k=sc.nextLong();
		    	  long i=solve(n,m,k);
		    	  
		    		  System.out.println(i);
		    	 
//			 }
		}
		static long solve(long n,long m,long a) {
	  		
		return (long)Math.ceil(n/(a*1.0))*(long)Math.ceil(m/(a*1.0));
	   }
}
