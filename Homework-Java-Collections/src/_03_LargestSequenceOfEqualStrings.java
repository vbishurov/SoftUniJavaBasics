import java.util.Scanner;


public class _03_LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input=scanner.nextLine().split(" ");
		String currentSequence=null;
		String largestSequence=null;
		int currentSequenceLength=0;
		int largestSequenceLength=Integer.MIN_VALUE;
		scanner.close();
		for (int i = 0; i < input.length; i++) {
			currentSequence=input[i];
			currentSequenceLength=0;
			while (i<input.length-1&&input[i].equals(input[i+1])) {
				currentSequence+=" "+input[i+1];
				i++;
				currentSequenceLength++;
			}
			if (currentSequenceLength>largestSequenceLength) {
			largestSequenceLength=currentSequenceLength;	
			largestSequence=currentSequence;
			}
		}
		System.out.println(largestSequence);
	}
}
