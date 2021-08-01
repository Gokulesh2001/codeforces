package codeforces;

import java.util.Scanner;

public class SpyDetected {

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
  		
		int count[]=new int[101];
//		int xor=0;
		for(int i:arr) {
			count[i]++;
		}
		for(int i=0;i<n;i++) {
			if(count[arr[i]]==1) {
				return i+1;
			}
		}
		return 1;
   }
}
