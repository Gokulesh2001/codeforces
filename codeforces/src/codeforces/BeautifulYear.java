package codeforces;

import java.util.Scanner;

public class BeautifulYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int ans=n+1;
       int i;
       for(i=n+1;!check(i);i++) {
    	   
       }
       ans=i;
       System.out.println(ans);
       
	}
   static boolean check(int n) {
	   int arr[]=new int[10];
	   int rem=0;
	   while(n!=0) {
		   rem=n%10;
		   if(arr[rem]>0) {
			   return false;
		   }
		   arr[rem]++;
		   n/=10;
	   }
	   
	   if(arr[0]>1) {
		   return false;
	   }
	   return true;
   }
}
