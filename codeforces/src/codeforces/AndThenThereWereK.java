package codeforces;
import java.util.Scanner;
public class AndThenThereWereK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0) {
    long n=sc.nextLong();
    long ans=1;
    while(ans<=n) {
    	ans<<=1;
    }
    ans>>=1;
    System.out.println(ans-1);
    }
	}

}
