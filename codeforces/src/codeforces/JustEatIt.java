package codeforces;


import java.util.Scanner;

public class JustEatIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    while(t-->0) {
    	int n=sc.nextInt();
    	long arr[]=new long[n];
    	
    	
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextLong();
    		
    	}
    	

    	if(check(arr,n))
    	System.out.println("Yes");
    	else
    	  System.out.println("No");
    }
    
    
	}
	static boolean check(long arr[],int n) {
		long sum=0;
		for(long i:arr) {
			sum+=i;
		}
		
		long max=arr[0];
		long s=0;
		int start=0;
		int end=0;
		int idx=0;
		for(int i=0;i<n;i++) {
			
			if(s==0) {
				idx=i;
			}
			s+=arr[i];
			if(s>max) {
				max=s;
				start=idx;
				end=i;
			}
			if(s<0) {
				s=0;
			}
		}
		
		if(max<sum || (end-start)==n-1) {
			return true;
		}
		return false;
		
		
		
	}

}
