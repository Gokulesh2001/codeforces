package codeforces;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	     int mat[][]=new int[5][5];
	     int row=-1,col=-1;
	    for(int i=0;i<5;i++) {
	    	for(int j=0;j<5;j++) {
	    		mat[i][j]=sc.nextInt();
	    		if(mat[i][j]==1) {
	    			row=i+1;
	    			col=j+1;
	    		}
	    	}
	    }
	   int count=Math.abs(row-3)+Math.abs(col-3);
	   System.out.println(count);
	   
	   
	}
	
}
