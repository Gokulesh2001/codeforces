package codeforces;

import java.util.Scanner;

public class LittleElephantAndRozdil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  long min=Long.MAX_VALUE;
  int min_index=-1;
//  long count=0;
  for(int i=0;i<n;i++) {
	  long temp=sc.nextLong();
	  if(min>temp) {
		  min_index=i+1;
		  min=temp;
	  }
	  else if(min==temp) {
		  min_index=-1;
	  }
  }
  
  if(min_index!=-1) {
	 System.out.println(min_index); 
  }
  else {
	  System.out.println("Still Rozdil");
  }
	  
	  
	}

}
