package codeforces;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class RegistrationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   
   int n=sc.nextInt();
   sc.nextLine();
   HashMap<String,Integer> map=new HashMap<>();
   
   for(int i=0;i<n;i++) {
	  String temp=sc.nextLine();
	  if(!map.containsKey(temp)) {
		  map.put(temp,0);
		  System.out.println("OK");
	  }
	  else {
		 
		  int count=(map.get(temp)+1);
		  map.put(temp,count);
		  
		  System.out.println(temp+count);
	  }
   }
   
	}

}
