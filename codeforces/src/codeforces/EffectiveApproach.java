package codeforces;

import java.util.Scanner;

public class EffectiveApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  
   int index[]=new int[100003];
   
   for(int i=0;i<n;i++) {
	   int temp=sc.nextInt();
	   index[temp]=i+1;
   }
   int q=sc.nextInt();
   
   long countV=0,countP=0;
   for(int i=0;i<q;i++) {
	   int bin=index[sc.nextInt()];
	   countV+=bin;
	   countP+=n-bin+1;
   }
   System.out.println(countV+" "+countP);
   
   
	}
	
//	static int binarySearch(int arr[],int k) {
//		int l=0,r=arr.length-1;
////		System.out.println(k);
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==k) {
//				return i+1;
//			}
//		}
//		return -1;
//	}

}
