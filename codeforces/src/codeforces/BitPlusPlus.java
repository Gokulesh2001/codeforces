package codeforces;

import java.util.Scanner;

public class BitPlusPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			sc.nextLine();
			int x=0;
			for(int i=0;i<n;i++) {
				String str=sc.nextLine();
				if(str.contains('+'+"")) {
					x++;
				}
				if(str.contains('-'+"")) {
					x--;
				}
				
			}
			System.out.println(x);
			
	}

}
