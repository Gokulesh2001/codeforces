package codeforces;
import java.util.*;
public class Taxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
    
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
    	 
     }

     int cars=0;
     int count4=0;
     int count3=0;
     int count2=0;
     int count1=0;
     for(int i=0;i<n;i++) {
    	 if(arr[i]==4) {
    		 count4++; 
    	 }
    	 if(arr[i]==3) {
    		 count3++;
    	 }
    	 if(arr[i]==2) {
    		 count2++;
    	 }
    	 if(arr[i]==1) { 
    		 count1++;
    	 }
     }
     
     
     
     cars=count4+count3+(count2/2);
     if(count2%2!=0) {
    	 count2=2;
    	 cars++;
     }
     else {
    	 count2=0;
     }
     if(count1-count3-count2<=0) {
    	 count1=0;
     }
     else {
    	 count1=(int)Math.ceil((count1-count3-count2)/4.0);
     }
     
     cars+=count1;
     System.out.println(cars);
     
	}

}
