package week3.day1;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String str="TestLeaf"; 
		char wanted='e';  
		int count=0;
		char[] array = str.toCharArray();
        for(int i=0;i<str.length();i++) 
        { 
        	if(array[i]==wanted) 
        	{ 
        		count++;
        	}
        } 
        if(count>0) 
        	System.out.println("The letter" + wanted + " is occurs:"+count+" times"); 
        String substring = str.substring(2, 5);
 System.out.println(substring);
	}

}
