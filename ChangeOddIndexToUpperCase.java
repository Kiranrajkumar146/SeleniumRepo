package week3.day1.assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		
		//Declare String Input as Follow
		//String test = "changeme";
		String test = "changeme";
		
		//Convert the String to character array
		char[] charArray = test.toCharArray();
		
		//Traverse through each character (using loop)
		for (int i = 0; i < charArray.length; i++) {
			
			//find the odd index within the loop (use mod operator)
			//within the loop, change the character to uppercase, if the index is odd else don't change
			if(i%2==0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
			else {
				charArray[i]=Character.toLowerCase(charArray[i]);
			}
		}
		
		System.out.println(charArray);
	}
}