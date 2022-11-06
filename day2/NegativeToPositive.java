package week1.day2;

public class NegativeToPositive {
	public static void main(String[] args) {
		int num=-40;
		int temp=num;
		if(num<0) {
			temp=temp*(-1);
		}
		System.out.println(num+" is converted to "+temp);
	}
}