package codeforces;

import java.util.Scanner;

public class SumOf2050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t-->0) {
	    	  long n=sc.nextLong();
	    	 
	    	  
	    	  System.out.println(solve(n));
	    		 
	      }
	}
	static int solve(long n) {
		
		if(n%2050!=0) {
			return -1;
		}
		long d=n/2050;
		
		int sum=0;
		while(d!=0) {
			sum+=d%10;
			d/=10;
		}
		return sum;
	}

}
