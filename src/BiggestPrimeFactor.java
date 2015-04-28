import java.io.*;

public class BiggestPrimeFactor {
 int x,d,k=1,p;
	public static void main(String[] args) {
		int n=34;
		
		System.out.println("Biggest Prime factor is::"+new BiggestPrimeFactor().find(n));
		
	}
	
	int find(int n)
	{
		 x=(int)Math.sqrt(n);
		 
		 for(int i=x;i>1;i--)
		 {
			 if(n%i==0)
			 {  p=n/i;
			 
				 find(p);break;
			 }
			
			 
		 }
		 
		 return p;
	}

}
