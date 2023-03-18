package week3.day1;

public class LearnOverLoading {

		public void add(int a, int b) 
		{ 
			System.out.println(a+b);
		} 
		public static void add(int a, double d,int c) 
		{ 
			System.out.println(a+d);
		} 
		public static void add(int a,float b,int c) 
		{ 
			System.out.println(a+b+c);
		}
 
		public static void add(float a,float b,int c) 
		{ 
			System.out.println(a+b);
		}  
		public void deposit() 
		{ 
			System.out.println("12%");
		} 
		public static void main(String[] args) {
			LearnOverLoading obj=new LearnOverLoading(); 
			obj.add(2, 6); 
			obj.add(3, 6.9f, 9);
			
		}

	

}
