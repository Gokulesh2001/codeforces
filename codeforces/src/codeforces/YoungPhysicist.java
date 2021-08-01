package codeforces;

import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
	      int n=sc.nextInt();

	      int sumX=0;
	      int sumY=0;
	      int sumZ=0;
	      
		 while(n-->0) {
			 sumX+=sc.nextInt();
			 sumY+=sc.nextInt();
			 sumZ+=sc.nextInt();
			
		 }
	    	  
	    	  
	    		  System.out.println((sumX==0) && (sumY==0) && (sumZ==0) ?"YES":"NO");
	    	 

	}
	
}


