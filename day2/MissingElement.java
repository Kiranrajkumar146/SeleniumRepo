package week1.day2;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,7,6,8};
		Arrays.sort(arr);
		for(int i=arr[0]; i<=arr.length; i++ ) {
			if((i+1)!=arr[i]) {
				System.out.println(i+1);
				break;
			}
		}
	}
}