package week3.day1;

public class LearnOverRiding extends LearnOverLoading { 
	//OverRiding can happen only in inhertance
		
		public void deposit() 
		{ 
			System.out.println("15%");
		}  
		public static void main(String[] args) {
			LearnOverRiding r=new LearnOverRiding();  
			r.deposit(); 
			LearnOverLoading l=new LearnOverLoading(); 
			l.deposit();
			
		}



}
