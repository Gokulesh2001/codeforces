package codeforces;

import java.util.Scanner;

public class PerfectlyImperfectArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
    int t=sc.nextInt();
    while(t-->0) 
    {
    	int n=sc.nextInt();
    	int arr[]=new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextInt();
    	}
    	int flag=0;
    	for(int i:arr) {
    		if((int)(Math.sqrt(i))*(int)Math.sqrt(i)!=i) {
    			System.out.println("YES");
    			flag=1;
    			break;
    		}
    	}
    	if(flag==1) {
    		continue;
    	}
    	System.out.println("NO");
    	
    	
    }
    
    
    
	}

}
