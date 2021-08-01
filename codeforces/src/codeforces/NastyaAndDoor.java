package codeforces;
import java.util.*;
public class NastyaAndDoor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		int k=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		
		
		int peaks=0;
		int min_index=0;
		int max=0;
		
		for(int i=1;i+1<k;i++) {
			if(arr[i-1]<arr[i] && arr[i] > arr[i+1]) {
				peaks++;
				
			}
			
		}
	   max=peaks;
	   
	   int l=0,r=k-1;
	   while(r<n-1) {
		   if(arr[r-1]<arr[r] && arr[r] > arr[r+1]) {
				peaks++;	
			}
		   
		    r++;
		    l++;
		    
		    if(arr[l-1]<arr[l] && arr[l] > arr[l+1]) {
				peaks--;	
			}
		    
		    if(peaks>max) {
		    	max=peaks;
		    	min_index=l;
		    }
		   
		   
	   }
		
		
		max++;
		min_index++;
		System.out.print(max+" "+min_index);
		System.out.println();
		}
	}

}
