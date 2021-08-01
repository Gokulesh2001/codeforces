package codeforces;

import java.util.Scanner;

public class LuckyDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 

	    	  int n=sc.nextInt();
	    	 
	    	  boolean i=solve(n);
	    	  
	    		  System.out.println(i?"YES":"NO");
	    	 

	}
	static boolean solve(int n) {
  		int arr[]=new int[1000];
  		arr[0]=4;
  		arr[1]=7;
  		int i;
  		int k=0;
  		for(i=2;i+1<n/2;) {
  			arr[i++]=arr[k]*10+4;
  			arr[i++]=arr[k++]*10+7;

  		}
		for(int j=0;j<i;j++) {
			if(n%arr[j]==0) {
				return true;
			}
		}
		return false;
   }

}

