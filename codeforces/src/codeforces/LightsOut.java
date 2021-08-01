package codeforces;
import java.util.*;
public class LightsOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[3][3];
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		arr[i][j]=sc.nextInt();
    	}
    }
    int lights[][]=new int[3][3];
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		lights[i][j]=1;
    	}
    }
    
    for(int i=0;i<3;i++) {
    	for(int j=0;j<3;j++) {
    		if(arr[i][j]%2!=0) {
    			toggle(lights,i,j);
    		}
    		
    		
    		
    	}
    }
    
    for(int k=0;k<3;k++) {
    	for(int h=0;h<3;h++) {
    		System.out.print(lights[k][h]);
    	}
    	System.out.println();
    }
    
	}
	

	static void toggle(int[][] grid,int i,int j) {
		
		if(grid[i][j]==0) {
			grid[i][j]=1;
		}
		else {
			grid[i][j]=0;
		}
//		if(check(grid,i-1,j-1)) {
//			if(grid[i-1][j-1]==0) {
//				grid[i-1][j-1]=1;
//			}
//			else {
//				grid[i-1][j-1]=0;
//			}	
//		}
		if(check(grid,i-1,j)) {
			if(grid[i-1][j]==0) {
				grid[i-1][j]=1;
			}
			else {
				grid[i-1][j]=0;
			}	
		}
		
//		if(check(grid,i-1,j+1)) {
//			if(grid[i-1][j+1]==0) {
//				grid[i-1][j+1]=1;
//			}
//			else {
//				grid[i-1][j+1]=0;
//			}	
//		}
		
		if(check(grid,i,j-1)) {
			if(grid[i][j-1]==0) {
				grid[i][j-1]=1;
			}
			else {
				grid[i][j-1]=0;
			}	
		}
		
		if(check(grid,i,j+1)) {
			if(grid[i][j+1]==0) {
				grid[i][j+1]=1;
			}
			else {
				grid[i][j+1]=0;
			}	
		}
		
//		if(check(grid,i+1,j-1)) {
//			if(grid[i+1][j-1]==0) {
//				grid[i+1][j-1]=1;
//			}
//			else {
//				grid[i+1][j-1]=0;
//			}	
//		}
		
		if(check(grid,i+1,j)) {
			if(grid[i+1][j]==0) {
				grid[i+1][j]=1;
			}
			else {
				grid[i+1][j]=0;
			}	
		}
//		
//		if(check(grid,i+1,j+1)) {
//			if(grid[i+1][j+1]==0) {
//				grid[i+1][j+1]=1;
//			}
//			else {
//				grid[i+1][j+1]=0;
//			}	
//		}
		
		
	}
    static boolean check(int[][] grid,int i,int j) {
    	
			   return i>=0 && i<grid.length && j>=0 && j<grid[0].length;
		  
    }
}
