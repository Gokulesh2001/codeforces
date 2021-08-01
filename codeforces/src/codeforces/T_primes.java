package codeforces;

import java.util.Scanner;

public class T_primes {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime[] = new boolean[1000001];
	    for (int i = 2; i <= 1000000; i++)
	        prime[i] = true;

	    for (int p = 2; p * p <= 1000000; p++)
	    {
	        // If prime[p] is not changed, then it is a
	        // prime
	        if (prime[p] == true)
	        {
	            // Update all multiples of p
	            for (int i = p * p; i <= 1000000; i += p)
	                prime[i] = false;
	        }
	    }
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0) {
	   
	   long n=sc.nextLong();
	  
	   long l=2,r=n-1;
	   long count=0;
	  
	   long ans=(long)Math.sqrt(n);

	   
    
	   
	   System.out.println(ans*ans==n &&  prime[(int)ans] ?"YES":"NO");
	   
   }
   
   
	}
	public static long fact(long p)
    {
        if (p <= 1)
            return 1;
        return p * fact(p - 1);
    }
       
    // Function to check if the
    // number is prime or not
    public static long isPrime(long p)
    {
        if (p == 4)
            return 0;
        return (fact(p >> 1) % p);
    }
}
