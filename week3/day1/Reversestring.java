package week3.day1;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String val="Amazon";  
		val=val.toLowerCase();
		char[] charArray = val.toCharArray();
		for(int i=val.length()-1;i>=0;i--) 
		{ 
			System.out.print(charArray[i]);
		}

	}

}
