package codeforces;

import java.util.Scanner;


public class SupercentralPoint {
	static class Pair{
		
		int i;
		int j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        Pair arr[]=new Pair[n];
        for(int i=0;i<n;i++) {
        	arr[i]=new Pair();
        	arr[i].i=sc.nextInt();
        	arr[i].j=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++) {
        	int up=0,down=0,left=0,right=0;
        	for(int j=0;j<n;j++) {
        		if(arr[i].i>arr[j].i && arr[i].j==arr[j].j) {
        			right++;
        		}
        		else if(arr[i].i<arr[j].i && arr[i].j==arr[j].j) {
        			left++;
        		}
        		else if(arr[i].i==arr[j].i && arr[i].j<arr[j].j) {
        			down++;
        		}
        		else if(arr[i].i==arr[j].i && arr[i].j>arr[j].j){
        			up++;
        		}
        	}
        	if(up>0 && down>0 && left>0 && right>0) {
        		count++;
        	}
        }
        System.out.println(count);
	}

}
