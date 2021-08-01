package codeforces;

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
public class Word
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    long[] arr=new long[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextLong();
		    }
		    long sum=0;
		    for(int i=0;i<2*k+1;i++) {
		    	sum+=arr[i];
		    }
		    
		    long sumFirst=0;
		     long sumLast=0;
		     
		     if(arr[0]>arr[1]){
		         int h=0;
		         int i=0;
		         for( i=0;i<n && h<k;i+=2,h++){
		             sumFirst+=arr[i];
		             arr[i]=0;
		         }
		         
		         
		            
		             sumLast=sum-sumFirst;
		         
		         
		         
		     }
		     else{
		         int h=0;
		         int i=0;
		         for( i=1;i<n && h<k;i+=2,h++){
		             sumFirst+=arr[i];
		             arr[i]=0;
		         }
		         
		         
		            
		             sumLast=sum-sumFirst;
		     }
		     System.out.println(Math.max(sumLast,sumFirst));
		     
		        
		        
		         
		        
		        
		        
	           
		    
		   
		}
	}
}


