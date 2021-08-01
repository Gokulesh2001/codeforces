package codeforces;

//import java.util.HashMap;
import java.util.Scanner;

public class RedAndBlueBeans {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0) {
    	  long r=sc.nextInt();
    	  long b=sc.nextInt();
    	  long d=sc.nextInt();
    	  
    	  solve(r,b,d);
    		 
      }
	}
	
	static void solve(long r,long b,long d) {
		if(Math.abs(r-b)<=d) {
			System.out.println("YES");
			return;
		}
		if(r>b) {
			long temp=r;
			r=b;
			b=temp;
		}
		if(r*(d+1)>=b) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}

}
