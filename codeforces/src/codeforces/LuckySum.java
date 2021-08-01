package codeforces;

import java.util.Scanner;
public class LuckySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		
		System.out.println(lucky(b)-lucky(a-1));
		
	}
	static long lucky(long b) {
		if(b==0) {
			return 0;
		}
		long luck[]=new long[10000000];
		luck[1]=4;
		luck[2]=7;
		int t=3;
		long sum=0;
		for(int i=1;i<1024;i++)
		{
			luck[t++]=luck[i]*10+4;
			luck[t++]=luck[i]*10+7;
		}
          
		
		
		for(int i=1;i<=1024;i++)
		{
			if(luck[i]<b)
			{
				sum+=luck[i]*(luck[i]-luck[i-1]);
			}
			else
			{
				sum+=luck[i]*(b-luck[i-1]);
				break; 
			}
		}

			return sum;

		
	}
	

}
