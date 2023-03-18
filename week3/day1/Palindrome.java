package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String str="madam";  
		int length = str.length();
		String rev=""; 
		char[] array = str.toCharArray(); 
		char arr[]=new char[length];
		int j=0;
		for(int i=length-1;i>=0;i--) 
		{  
			arr[j++]=array[i]; 
		}  
		rev=new String(arr); //to convert charARRAY to string
		//System.out.println(rev);
		if(rev.equals(str)) 
		{ 
			System.out.println("palinDrome");
		}

	}
	

}
