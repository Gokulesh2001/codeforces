package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class NextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    
   Arrays.sort(arr);
   
   int small=1;
   for(int i=0;i<n;) {
	   int a=arr[i];
	   
	   if(arr[i]>small) {
		   System.out.println(small);
		   return;
	   }
	   else {
		   small=arr[i]+1;
	   }
	   while(i<n && arr[i]==a) {
		   i++;
	   }
   }
   System.out.println(small);
	}

}
