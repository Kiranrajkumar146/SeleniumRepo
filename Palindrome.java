package week3.day1.assignments;


public class Palindrome {
	////Build a logic to find the given string is palindrome or not
	public static void main(String[] args) {
		
		//Declare A String value as"madam"
		String value="madam";

		//Declare another String rev value as ""
		String rev="";
		
		//Iterate over the String in reverse order
	    for(int i=value.length()-1; i>=0; i--){
	    	//Add the char into rev
	        rev+=value.charAt(i);  
	    }
	    
		//Compare the original String with the reversed String, if it is same then print palinDrome
		if(value.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	
	}
}