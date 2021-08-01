package codeforces;
import java.util.*;
import java.io.*;
public class CalculatingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  long n=sc.nextLong();
  
  if(n%2==0) {
	  System.out.println(n/2);
  }
  else {
	  System.out.println(-1*(n+1)/2);
  }
	}

}
