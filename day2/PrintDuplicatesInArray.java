package week1.day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};  
		Arrays.sort(arr);
		int len=arr.length;  
		int count=0;
		for(int i=0;i<len-1;i++) 
		{  
			for(int j=i+1;j<len;j++) 
			{ 
				if(arr[i]==arr[j]) 
				{ 
					count++;
			       System.out.print(arr[i]+" "); 
				}
			}
		}
	}

}
