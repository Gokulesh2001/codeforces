package codeforces;

import java.util.Scanner;

public class FindTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   
   int t=sc.nextInt();
   
   while(t-- > 0)
   {
	   int n=sc.nextInt();
	   long sumOdd=0,sumEven=0;
	   long arr[]=new long[n];
	   
	   for(int i = 0;i < n;i++) 
	   {

		  arr[i]=sc.nextLong();
		       if((i&1)==0) {
			   sumOdd+=arr[i];
			   }
			   else {
				   sumEven+=arr[i];
			   }
	   }
	   if(sumEven>sumOdd) {
	   for(int i=0;i<n;i++) {
		   if((i&1)==0) {
		   System.out.print(1+" ");
		   }
		   else {
			   System.out.print(arr[i]+" ");   
		   }
	   }
	   }
	   else {
		   for(int i=0;i<n;i++) {
			   if((i&1)!=0) {
			   System.out.print(1+" ");
			   }
			   else {
				   System.out.print(arr[i]+" ");   
			   }
		   }  
	   }
	   System.out.println();
	   
   }
	}

}
