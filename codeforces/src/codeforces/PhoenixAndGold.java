package codeforces;


import java.util.Scanner;

public class PhoenixAndGold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
   		while(t-->0) {
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    
	    int sum=0;
	    int ch=0;
	    int i;
	   for( i=0;i<arr.length;i++) {
		   sum+=arr[i];
		   if(sum==x) {
			   int f=0;
			   for(int j=i+1;j<n;j++) {
				   if(arr[i]!=arr[j]) {
				   int temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				   f=1;
				   break;
				   
				   }
			   }
			   ch=f;
		       break; 
			   
		   }
		  
			   
	   }
	   if(i!=n&& ch==0) {
		   System.out.println("NO");
	   }
	   else {
		   System.out.println("YES");
		   for(int j=0;j<arr.length;j++) {
			   System.out.print(arr[j]+" ");
		   }
	   }
	    
   	}
	
	
  }

}
