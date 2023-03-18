package week3.day1;

public class IPad2 extends IPad{ 
	public void watchMovie() 
	{ 
		System.out.println("Not Watching Movie");
	}


	public static void main(String[] args) {
		IPad2 movie=new IPad2(); 
		movie.watchMovie();
		IPad movie2=new IPad(); 
		movie2.watchMovie();

	}

}
