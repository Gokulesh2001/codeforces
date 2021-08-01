package codeforces;

import java.util.Scanner;

public class JzzhuAndChildren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     int max=Integer.MIN_VALUE;
     int arr[]=new int[n];
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
    	 if(max<arr[i]) {
    		 max=arr[i];
    	 }
    	 if(arr[i]>k) {
    		 if(arr[i]%k!=0) {
    			 arr[i]=arr[i]/k;
    			 arr[i]++;
    		 }
    		 else {
    			 arr[i]=arr[i]/k;
    		 }
    	
    	 }
    	 else {
    		 arr[i]=arr[i]/k;
    	 }
     }
     
     if(max==k) {
    	 System.out.println(n);
    	 return;
     }
      max=Integer.MIN_VALUE;
     int max_index=-1;
     for(int i=0;i<n;i++) {
    	 if(arr[i]>=max) {
    		 max=arr[i];
    		 max_index=i+1;
    	 }
     }
     System.out.println(max_index);
	}

}
