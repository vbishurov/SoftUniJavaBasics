import java.util.Scanner;

public class _04_LongestIncreasingSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		scanner.close();
		int[] numbers = new int[input.length];
		String currentSequence = null;
		String longestSequence = null;
		int currentSequenceLength = 0;
		int longestSequenceLength = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			currentSequence = "" + numbers[i];
			currentSequenceLength = 0;
			while (i < numbers.length - 1 && numbers[i] < numbers[i + 1]) {
				currentSequence += " " + numbers[i + 1];
				i++;
				currentSequenceLength++;
			}
			System.out.println(currentSequence);
			if (currentSequenceLength > longestSequenceLength) {
				longestSequence = currentSequence;
				longestSequenceLength = currentSequenceLength;
			}
		}
		System.out.printf("Longest: %s",longestSequence);
	}
}
