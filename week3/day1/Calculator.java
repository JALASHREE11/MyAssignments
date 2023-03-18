package week3.day1;

public class Calculator { 
	public void add(int a, int b) 
	{ 
		System.out.println(a+b);
	} 
	public static void add(int a, int b,int c) 
	{ 
		System.out.println(a+b);
	} 
	public void multiple(double a, double b) 
	{ 
		System.out.println(a*b);
	} 
	public static void multiple(int a, double b) 
	{ 
		System.out.println(a*b);
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Calculator cal=new Calculator(); 
		add(2, 4, 8);
        cal.multiple(0.0, 5.6); 
        cal.add(3, 8); 
        multiple(5, 9.76);
	}

}
