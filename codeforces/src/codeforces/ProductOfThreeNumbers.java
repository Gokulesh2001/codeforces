package codeforces;
import java.util.*;

public class ProductOfThreeNumbers {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		
		while(t-->0) {
			
			long n=sc.nextLong();
			int count=0;
			HashSet<Long> set=new HashSet<Long>();
			for(long i=2;i*i<=n;i++) {
				if(n%i==0 ) {
					set.add(i);
					n/=i;
					count++;
					break;
				}
			}
			
			for(long i=2;i*i<=n;i++) {
				if(n%i==0 && !set.contains(i)) {
					set.add(i);
					n/=i;
					count++;
					break;
				}
			}
			
			if(set.size()>1  && !set.contains(n) && n!=1 ) {
				set.add(n);
				System.out.println("Yes");
				for(long i:set) {
					System.out.print(i+" ");
				}
			}
			else {
				System.out.print("No");
			}
			System.out.println();
		}
	}
	
	
	
}
