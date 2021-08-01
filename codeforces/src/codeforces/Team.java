package codeforces;

import java.util.Scanner;

public class Team {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in); 
//		      int t=sc.nextInt();
//			 while(t-->0) {
		    	  int n=sc.nextInt();
		    	  int count=0;
		    	  while(n-->0) {
		    		  int k=0;
		    	  int a=sc.nextInt();
		    	  if(a==1) {
		    		  k++;
		    	  }
		    	  int b=sc.nextInt();
		    	  if(b==1) {
		    		  k++;
		    	  }
		    	  int c=sc.nextInt();
		    	  if(c==1) {
		    		  k++;
		    	  }
		    	  if(k>=2) {
		    		  count++;
		    	  }
		    	  }
		    	 
		    	 System.out.println(count);
			 
		}
		

}
