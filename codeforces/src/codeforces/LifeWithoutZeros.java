package codeforces;

import java.util.Scanner;

public class LifeWithoutZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
   long a=sc.nextLong();
   long b=sc.nextLong();
   long c=a+b;
   
//   long zeroC=0;
//   long zeroA=0;
//   long zeroB=0;
   
if(getNum(a)+getNum(b)==getNum(a+b)) 
   System.out.println("YES");
else
	 System.out.println("NO");
    
	}
	
	static long getNum(long n) {
		long sum=0;
		
		while(n!=0) {
			if(n%10!=0) {
				
			sum=(sum*10)+(n%10);
			
			}
			n/=10;
			
		}
		n=sum;
		sum=0;
		while(n!=0) {
			
			sum=(sum*10)+(n%10);
			
			n/=10;
		}
//		System.out.println(sum);
		return sum;
	}

}
