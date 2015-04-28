

public class ShortestDistance {
	int minD;
	static  int A[][] = {
	     {0,15,80,90},
		 {-1,0,40,50},
		 {-1,-1,0,70},
		 {-1,-1,-1,0}
		 };

	 
	 public static void main(String a[])
	 {	
		System.out.println(new ShortestDistance().minDistance(0,3));
	 }

   public int minDistance(int start,int end)
   { 
	  
	   while (start<=end){
	   if(start==end) {return 0;}
	   else{
            minD= Math.min(A[start][end],  A[start][start+1] +minDistance(start+1,end));
	   } 
	   }
	  
	   return minD;
   }
   

}
