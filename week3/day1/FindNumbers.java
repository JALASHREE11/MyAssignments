package week3.day1;

public class FindNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Chennai 600071"; 
String str1=str.replaceAll("[^0-9]",""); //replaces(^ this ingores the elements that are not 0-9(chennai )) ti with"")
System.out.println(str1);
int i=Integer.parseInt(str1);  
System.out.println(i);
	}

}
