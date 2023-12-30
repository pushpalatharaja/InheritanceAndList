package week3.home_assignment;

import java.util.Arrays;

public class OddIndexToUpper {
	

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] charArr=test.toCharArray();
		int lengthArr=charArr.length;
		
		for(int i=0;i<=lengthArr-1;i++) {
			if(i%2!=0) {
				
				System.out.print(Character.toUpperCase(charArr[i]));
				
			}
			else {
				System.out.print(charArr[i]);
			}
			
			
		}
		
	}

}
