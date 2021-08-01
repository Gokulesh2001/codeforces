package codeforces;

import java.util.Scanner;

public class TitForTat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t-->0) {
	    	  int n=sc.nextInt();
	    	  int k=sc.nextInt();
	    	  int arr[]=new int[n];
	    	  for(int i=0;i<n;i++) {
	    		  arr[i]=sc.nextInt();
	    	  }
	    	  solve(n,k,arr);
	    	  
	    	  for(int i:arr) {
	    		  System.out.print(i+" ");
	    	  }
	      }
	}
	static void solve(int n,int k,int[] arr) {
  		while(k>0) {
  			k-=n;
		for(int i=0;i+1<n;i++) {
			if(arr[i]-1<0) {
				k=0;
				break;
			}
			arr[i]=arr[i]-1;
			arr[i+1]=arr[i+1]+1;
		}
		
  		}
   }
}
