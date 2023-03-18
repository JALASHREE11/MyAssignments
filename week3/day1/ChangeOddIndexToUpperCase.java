package week3.day1;

public class ChangeOddIndexToUpperCase {


	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String test = "changeme";  
		int len=test.length();
	     char[] arr = test.toCharArray(); 
	     for(int i=0;i<len;i++)
	     { 
	    	 if(i%2!=0) 
	    	 { 
	    		 
	    		 System.out.print(Character.toUpperCase(arr[i]));//to convert char to upppercase
	    	 } 
	    	 else 
	    	 { 
	    	   System.out.print(arr[i]);
	    	 }
	     }
	     
	}

}
