package codeforces;

import java.util.Scanner;

public class DimaAndFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
   int sum=0;
    for(int i=0;i<n;i++) {
    	sum+=sc.nextInt();
    }
    n++;
    int count=0;
    if((sum+1)%n!=1) {
    	count++;
    }
    if((sum+2)%n!=1) {
    	count++;
    }
    if((sum+3)%n!=1) {
    	count++;
    }
    if((sum+4)%n!=1) {
    	count++;
    }
    if((sum+5)%n!=1) {
    	count++;
    }
    
    System.out.println(count);
    
    
    

}

}
