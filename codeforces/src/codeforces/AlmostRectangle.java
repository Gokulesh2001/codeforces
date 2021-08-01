package codeforces;
import java.util.*;
public class AlmostRectangle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		  int n=sc.nextInt();
		  sc.nextLine();
		  ArrayList<Integer> list=new ArrayList<>();
		  char arr[][]=new char[n][n];
		  for(int i=0;i<n;i++) {
			  String charArr=sc.nextLine();
			  for(int j=0;j<n;j++) {
				  arr[i][j]=charArr.charAt(j);
				  if(charArr.charAt(j)=='*') {
					  list.add(i);
					  list.add(j);
				  }
			  }
		  }
		  
		  if(list.get(0)==list.get(2)) {
			  if(list.get(0)!=n-1) {
			  arr[list.get(0)+1][list.get(1)]='*';
			  arr[list.get(2)+1][list.get(3)]='*';
			  }
			  else {
				  arr[list.get(0)-1][list.get(1)]='*';
				  arr[list.get(2)-1][list.get(3)]='*'; 
			  }
		  }
		  else if(list.get(1)==list.get(3)) {
			  if(list.get(1)!=n-1) {
			  arr[list.get(0)][list.get(1)+1]='*';
			  arr[list.get(2)][list.get(3)+1]='*';
			  }
			  else {
			   arr[list.get(0)][list.get(1)-1]='*';
			   arr[list.get(2)][list.get(3)-1]='*';
			  }
		  }
		  else {
			  arr[list.get(0)][list.get(3)]='*';
			  arr[list.get(2)][list.get(1)]='*';
		  }
		  for(int i=0;i<n;i++) {
			  
			  for(int j=0;j<n;j++) {
				 System.out.print(arr[i][j]); 
			  }
			  System.out.println();
		  }
		  }
		
	}
   static void solve() 
   {
	  Scanner sc=new Scanner(System.in);
	  
	  
   }
}
