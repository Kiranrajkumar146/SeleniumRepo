package week3.day1.assignments;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		//Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		
		//Initialize an integer variable as count
		int count=0;
		
		//Split the String into array and iterate over it 
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			//Initialize another loop to check whether the word is there in the array
			for (int j = i+1; j < split.length; j++) {
				//if it is available then increase and count by 1. 
				if (split[i].equals(split[j])) {
					count = count + 1;
					//if the count > 1 then replace the word as "" 
					split[j]="";
				}
				}
		}
		for (int l = 0; l < split.length; l++) {
			System.out.print(split[l]+" ");
		}
	}
}