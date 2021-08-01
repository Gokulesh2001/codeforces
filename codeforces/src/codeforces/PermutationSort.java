package codeforces;

import java.util.Scanner;

public class PermutationSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-->0) {
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int count=0;
		    for(int i=0;i<n;i++) {
		    	arr[i]=sc.nextInt();
		    }
		    
		    for(int i=1;i<=n;i++) {
		    	if(i!=arr[i-1]) {
		    		count=-1;
		    	}
		    }
		   if(count==0) {
			 
		   }
		    else if(arr[0]==n && arr[n-1]==1) {
			   count=3;
		   }
		   else if(arr[0]==1 || arr[n-1]==n) {
			   count=1;
		   }
		   else if(arr[0]!=1 && arr[n-1]!=n) {
			   count=2;
		   }
		    
		    System.out.println(count);
		    }
	}

}
