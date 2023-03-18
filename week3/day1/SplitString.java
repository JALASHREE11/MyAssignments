package week3.day1;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String str="Jalashree is a good girl"; 
		String[] split = str.split(" "); 
		for(int i=0;i<split.length;i++) 
		System.out.println(split[i]); 
		System.out.println("Length: "+split.length);

	}

}
