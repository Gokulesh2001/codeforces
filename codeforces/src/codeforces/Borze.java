package codeforces;

import java.util.Scanner;

public class Borze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ans="";
		int n=str.length();
		for(int i=0;i<n;) {
			if(str.charAt(i)=='.' ) {
				ans+="0";
				i++;
			}
			else if(str.charAt(i)=='-' && str.charAt(i+1)=='.' ) {
				ans+="1";
				i+=2;
			}
			else {
				ans+="2";
				i+=2;
			}
//			System.out.println(ans);
		}
		System.out.println(ans);
		
	}

}
