package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int num=34343, rem, x=0;
		int temp=num;
		while(temp!=0) {
			rem=temp%10;
			temp=temp/10;
			x=x*10+rem;
		}
		if(x==num) {
			System.out.println(num +" is palindrome");
		}
		else {
			System.out.println(num +" is not palindrome");
		}
	}
}