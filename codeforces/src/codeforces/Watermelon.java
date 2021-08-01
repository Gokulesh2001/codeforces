package codeforces;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if((n&1)==0 && n>2) {
    	 System.out.println("YES");
     }
     else {
    	 System.out.println("NO");
     }
     sc.close();
	}

}
