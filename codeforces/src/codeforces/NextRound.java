package codeforces;

import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
//	      int t=sc.nextInt();
//		 while(t-->0) {
	    	  int n=sc.nextInt();
	    	  int k=sc.nextInt();
	    	  int arr[]=new int[n];
	    	  for(int i=0;i<n;i++) {
	    		  arr[i]=sc.nextInt();
	    	  }
	    	  int i=solve(n,k,arr);
	    	  
	    		  System.out.println(i);
	    	 
//		 }
	}
	static int solve(int n,int k,int[] arr) {
  		int min=arr[k-1];
  		int count=0;
  		for(int i:arr) {
  			if(i>0) {
  				if(i>=min) {
  					count++;
  			    }
  				else {
  					break;
  				}
  				
  			}
  		}
		return count;
   }
}
