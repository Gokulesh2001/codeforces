package codeforces;
import java.util.*;
public class BerlandRegional {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  class pair{
			  long i;
			  long j;
		  }
   Scanner sc=new Scanner(System.in);
   
   int t=sc.nextInt();
   
   while(t-->0) 
   {
	   int n=sc.nextInt();
       long univ[]=new long[n];
	   long skill[]=new long[n];
	   long max=0;
	   for(int i = 0; i < n ; i++)
	   {
		   univ[i]=sc.nextLong();
		   
	   }
	   ArrayList<pair> arr=new ArrayList<>();

	   for(int i = 0; i < n ; i++)
	   {
		   pair temp=new pair();
		   skill[i]=sc.nextLong();
		   temp.i=univ[i];
		   temp.j=skill[i];
		   arr.add(temp);
	   }
	   
	   Collections.sort(arr,new Comparator<pair>() {
		   public int compare(pair a,pair b) {
		   return a.j<b.j?1:-1;
		   }
	   });
	   
       

	   HashMap<Long,ArrayList<Long>> map=new HashMap<>();
	  
	   for(int i=0;i<n;i++) 
       {
    	   
		   
	   if(map.get(arr.get(i).i)==null) 
	   {
		   ArrayList<Long> l=new ArrayList<Long>();
		   l.add(arr.get(i).j);
		   if(max<l.size()) {
			   max=l.size();
		   }
		   map.put(arr.get(i).i,l);

	   }
	   else if(map.get(arr.get(i).i).size()<=n)
	   {
		   ArrayList<Long> l=map.get(arr.get(i).i);
		   l.add(l.get(l.size()-1)+arr.get(i).j);
		   if(max<l.size()) {
			   max=l.size();
		   }
		   map.put(arr.get(i).i,l);
	   }
	   
       }
       long ans[]=new long[n];
	   	 
	  



       

		   
		   for(long j:map.keySet()) 
		   {  
			   for(int i = 1; i<=map.get(j).size()  ;i++) {
               
			      int temp=map.get(j).size()-(map.get(j).size()%i)-1;
			      
				  ans[i-1]+=map.get(j).get(temp); 
               	   
		   }   
	   }
	   
	   for(long i:ans) 
	   {
		   System.out.print(i+" ");
	   }
			
	   System.out.println();	  
   }
	}

}
