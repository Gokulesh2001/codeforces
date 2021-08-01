package codeforces;

import java.util.Scanner;

public class ArraySharpening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();
    while(t-->0)
    {
    	
    	int n=sc.nextInt();
    	long arr[]=new long[n];
    	
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextLong();
    	}
    	
    	int prefixEnd = -1, suffixEnd = n;

	    for (int i = 0; i < n; ++i) {
		    if (arr[i] < i) break;
		    prefixEnd = i;
	    }
	    for (int i = n-1; i >= 0; --i) {
		    if (arr[i] < (n-1)-i) break;
		    suffixEnd = i;
	    }
//	    System.out.println(prefixEnd);
//	    System.out.println(suffixEnd);
	    if (suffixEnd <= prefixEnd) // Non-empty intersection
		   System.out.println("Yes");
	    else
	    	System.out.println("No");
    	
    	
    }
    
    
    
    
	}

}
