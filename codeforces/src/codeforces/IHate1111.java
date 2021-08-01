package codeforces;
import java.util.Scanner;
public class IHate1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		   int t=sc.nextInt();
		   
		   while(t -->0) 
		   {
			   long n=sc.nextLong();
			   long k=11;
			   long j=111;
			   int f=0;
			   for(int i=0;i<20;i++) {
				   if(n%11==0) {
					   f=1;
					   break;
				   }
				   else {
					   n-=111;
				   }
				   if(n<0) {
					   break;
				   }
				   
			   }
			  
			   System.out.println(f==1?"YES":"NO");
		   }
	}

}
