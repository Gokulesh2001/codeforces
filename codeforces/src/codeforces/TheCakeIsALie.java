package codeforces;

import java.util.Scanner;

public class TheCakeIsALie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int t=sc.nextInt();
	      while(t-->0) {
	    	  int n=sc.nextInt();
	    	  int m=sc.nextInt();
	    	  int k=sc.nextInt();
	    	  
	    	  System.out.println(solve(n,m,k)?"YES":"NO");
	      }
	}
	static boolean solve(int n,int m,int k) {
  		int dp[][]=new int[n][m];
  		for(int i=0;i<n;i++) {
  			for(int j=0;j<m;j++) {
  				if(i==0 && j==0) {
  					continue;
  				}
  				else if(i==0) {
  					dp[i][j]=dp[i][j-1]+1;
  				}
  				else if(j==0) {
  					dp[i][j]=dp[i-1][j]+1;
  				}
  				else {
  					dp[i][j]=dp[i-1][j]+(j+1);
  				}
  			}
  		}
  			return dp[n-1][m-1]==k;
  		
   }
}