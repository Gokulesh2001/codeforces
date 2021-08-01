package codeforces;

import java.util.Scanner;

public class QueueAtTheSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     sc.nextLine();
     String str=sc.nextLine();
     char arr[]=str.toCharArray();
     for(int i=0;i<k;i++) {
    	for(int j=0;j+1<n;j++) {
    		if(arr[j]=='B' && arr[j+1]=='G') {
    			arr[j]='G';
    			arr[j+1]='B';
    			j++;
    		}
    	}
     }
     
     System.out.println(new String(arr));
	}

}
