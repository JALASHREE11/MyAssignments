package week1.day1;

public class FibbinnocciNumber {

	public static void main(String[] args) {
		
       		int n1=0,n2=1,n3=0,n=1;  
			   System.out.print(n1+" "); 
			   System.out.print(n2+" ");
					while(n<=11)
					{ 
						n3=n1+n2;
						System.out.print(n3+" ");
						n1=n2; 
						n2=n3; 
						n++;
						}
						
					}
		



	

}
