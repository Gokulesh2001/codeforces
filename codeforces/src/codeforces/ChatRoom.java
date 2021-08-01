package codeforces;

import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       
       String s="hello";
       int index=0;
       char lookingFor=s.charAt(index);
       for(char c:str.toCharArray()) {
    	   if(lookingFor==c && index==4) {
    		   System.out.println("YES");
    		   return;
    	   }
    	   else if(lookingFor==c) {
    		   index++;
    		   lookingFor=s.charAt(index);
    	   }
       }
       
       System.out.println("NO");
	}

}
