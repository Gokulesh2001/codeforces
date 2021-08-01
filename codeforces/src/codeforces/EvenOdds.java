package codeforces;

import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        if((n+1)/2>=k) {
        	System.out.println(k*2-1);
        }
        else {

        	System.out.println((k-(n+1)/2)*2);
        }
	}

}
