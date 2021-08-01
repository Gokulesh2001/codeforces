package codeforces;


import java.util.Scanner;

public class PlanetLapituletti {
	    static int[] arr;
    
  
	public static void main(String[] args){
		// TODO Auto-generated method stub
		   arr=new int[10];
		    arr[0]=0;
		    arr[1]=1;
		    arr[2]=5;
		    arr[3]=-1;
		    arr[4]=-1;
		    arr[5]=2;
		    arr[6]=-1;
		    arr[7]=-1;
		    arr[8]=8;
		    arr[9]=-1;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
		    String strr[]=sc.nextLine().split(" ");
		    int hh=Integer.parseInt(strr[0]);
		    int mm=Integer.parseInt(strr[1]);
		    
		    String str=sc.nextLine();
		   
		    int a=(str.charAt(0)-'0')*10+(str.charAt(1)-'0');
		    int b=(str.charAt(3)-'0')*10+(str.charAt(4)-'0');
		    
		    while(!check(a,b, hh, mm)) {
		    	b++;
		    	if(b==mm)a++;
		    	a%=hh;
		    	b%=mm;
		    }
		    System.out.printf("%02d:",a);
		    System.out.printf("%02d\n",b);
		    
		}
	}
	 static boolean check(int a,int b,int h,int m) {
		if(arr[a%10]==-1 || arr[a/10]==-1 || arr[b%10]==-1 || arr[b/10]==-1) {
			return false;
		}
		
		int aa= (arr[b%10]*10)+arr[b/10];
		int bb= (arr[a%10]*10)+arr[a/10];
		
		if(aa<h && bb<m) {
			
			return true;
		}
		return false;
	}

}
