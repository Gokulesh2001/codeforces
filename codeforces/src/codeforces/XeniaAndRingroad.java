package codeforces;
import java.util.*;
public class XeniaAndRingroad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  
  int n=sc.nextInt();
  int m=sc.nextInt();
  int t=1;
  
  int arr[]=new int[m];
  
  for(int i=0;i<m;i++) {
	  arr[i]=sc.nextInt();
  }
  long count=arr[0]-1;
  int i=0;
 
  for( ;i+1<m;i++) {
	  
	  int element=arr[i];
	  
	  if( arr[i]>arr[i+1]) {
		  count+=n-element+arr[i+1];
	  }
	  else {
		  count+=arr[i+1]-arr[i];
		 
	  }
	
	 
  
  }
  System.out.println(count);
	}

}
