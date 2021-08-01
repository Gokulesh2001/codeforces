package codeforces;

import java.util.Scanner;

public class BoyOrGirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     int arr[]=new int[26];
     
     for(char c:str.toCharArray()) {
    	 arr[c-'a']++;
     }
     int count=0;
     for(int i:arr) {
    	 if(i>=1) {
    		 count++;
    	 }
     }
     System.out.print(count%2==0?"CHAT WITH HER!":"IGNORE HIM!");
     
	}

}
