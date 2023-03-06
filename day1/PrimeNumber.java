package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int n=43,f=0;
		for(int i=2;i<=n-1;i++) 
		{
		    if(n%i==0)  
			  {
			   f+=1; 
			  break; 
			  }
		  
		} 
		if(f>0) 
		{ 
		  System.out.println("Is not Prime Number");
		} 
		else 
		{
			System.out.println("Is Prime Number");
		}
		

	}

}
