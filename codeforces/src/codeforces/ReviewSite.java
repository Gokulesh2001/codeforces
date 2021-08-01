package codeforces;

import java.util.Scanner;

public class ReviewSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
		 while(t-->0) {
	    	  int n=sc.nextInt();
	    	 
	    	  int arr[]=new int[n];
	    	  for(int i=0;i<n;i++) {
	    		  arr[i]=sc.nextInt();
	    	  }
	    	  int i=solve(n,arr);
	    	  
	    		  System.out.println(i);
	    	 
		 }
	}
	static int solve(int n,int[] arr) {
		
		int up=0;
		int down=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1 || arr[i]==3) {
				up++;
			}
			else if(arr[i]==2) {
				down++;
			}
			
		}
			return up;
		
 }
}
