package codeforces;

import java.util.Scanner;

public class OrdinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t-->0) {
	    	  long n=sc.nextLong();
	    	 
	    	  
	    	  System.out.println(solve(n));
	      }
	}
	      static long solve(long n) {
	  		long total=0;
	  		
	  		for(int i=1;i<=9;i++) {
	  			
	  			for(long j=i;j<=n;) {
	  				
	  				total++;
	  				j=j*10+i;
	  			}
	  		}
	  		
	  		return total;
	  	}
}
