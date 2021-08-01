package codeforces;

import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc=new Scanner(System.in);
	     
	     long n=sc.nextLong();
	     long count=0;
//	    while(n!=0) {
	    	if(n!=0 && n%5>=0) {
	    		count+=(n/5);
	    		n%=5;
	    	}
	    	
	    	if(n!=0&&n%4>=0) {
	    		count+=(n/4);
	    		n%=4;
	    	}
	    	if(n!=0&&n%3>=0) {
	    		count+=(n/3);
	    		n%=3;
	    	}
	    	if(n!=0&&n%2>=0) {
	    		count+=(n/2);
	    		n%=2;
	    	}
	    	if(n!=0&&n%1>=0) {
	    		count+=n;
	    		n%=1;
	    	}
	    	
//	    }
	    System.out.println(count);
	}

}
