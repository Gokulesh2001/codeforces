package codeforces;

import java.util.Scanner;

public class Inflation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     
     while(t-- > 0)
     {
    	 int n = sc.nextInt();
    	 int k = sc.nextInt();
    	 long arr[] = new long[n];
    	 
    	 for(int i = 0; i < n;i++)
    	 {
    		 arr[i] = sc.nextLong();
    	 }
    	 
    	
    	 
    	 long l = 0,r = (long)Math.pow(10,14);
    	 while(l < r) 
    	 {
    		 long mid = l+(r-l)/2;
    		 boolean ok=true;
    		 long sum=arr[0]+mid;
    		 for(int i = 1;i < n;i++) {
    			 
    			 if(arr[i]>(sum)*k/100) {
        			 ok = false;
        			 break;
        		 }
    			 sum+=arr[i];
    		 }
    		 
    		 if(ok) 
    		 {
    			r=mid;
    		 }
    		 else
    		 {
    			 l=mid+1;
    		 } 
    	 }
    	 System.out.println(l);
     }
     
	}

}
