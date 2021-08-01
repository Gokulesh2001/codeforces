package codeforces;
import java.util.Scanner;
public class BalancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   
   while(t -->0) 
   {
	   int n=sc.nextInt();
	   n=n/2;
	   if(n%2!=0) {
		   System.out.println("NO");
	   }
	   else {
		   System.out.println("YES");
		   long sum=0;
		   for(int i=2;i<=2*n;i+=2) {
			   System.out.print(i+" ");
			   sum+=i;
		   }
		   for(int i=1;i<2*(n-1);i+=2) {
			   System.out.print(i+" ");
			   sum-=i;
		   }
		   
		   System.out.println(sum+" ");
	   }
   }
	}

}
