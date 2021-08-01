package codeforces;
import java.util.*;
public class ArrangingTheSheep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0) 
    {
    	int n=sc.nextInt();
    	sc.nextLine();
    	String str=sc.nextLine();
    	long min=Integer.MAX_VALUE;
    	long count=0;
    	
    	for(int i=0;i<n;i++) 
    	{
    		if(str.charAt(i)=='*') {
				count++;
			}	
    		
    	}
    	if(count==n || count==0) {
    		System.out.println(0);
    		continue;
    	}
    	int f=0;
    	for(int i=0;i<n;) {
    		long c=0;
    		if(str.charAt(i)=='*') {
    		while(i<n && str.charAt(i)=='*') {
    			c++;
    			i++;
    		}
    		if(c==count) {
    			f=1;
    			break;
    		}
    		}
    		else
    		 {
    			i++;
    		}
    		
    	}
    	if(f==1 ) {
    		System.out.println(0);
    		continue;
    	}
    	
    	
    	long sum=0;
    	long left=0;
    	for(int i=0;i<n;i++) {
    		if(str.charAt(i)=='.') {
    			sum+=Math.min(left,count-left);
    		}
    		else {
    			
    			left++;
    		}
    		
    	}
    	System.out.println(sum);
    	}
	}

}
