package codeforces;

import java.util.Scanner;

public class PetrAndBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
       int n=sc.nextInt();
       int arr[]=new int[7];
       long sum=0;
       for(int i=0;i<7;i++) {
    	   arr[i]=sc.nextInt();
    	   sum+=arr[i];
       }
       long newSum=n%sum;
       if(newSum==0) {
    	  newSum=sum;
       }
       sum=0;
       for(int i=0;i<7;i++) {
    	   sum+=arr[i];
    	   if(sum>=newSum) {
    		   System.out.println(i+1);
    		   return;
    	   }
       }
       
       
	}

}
