import java.util.Scanner;

public class _03_Largest3Rectangles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputNumbers = scanner.nextLine().split("[^0-9]+");
		scanner.close();
		int[] numbers = new int[inputNumbers.length-1];
		for (int i = 1; i < inputNumbers.length; i++) {
			numbers[i-1] = Integer.parseInt(inputNumbers[i]);
		}
		int maxArea = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length - 5; i += 2) {
			int currentArea = numbers[i] * numbers[i + 1] + numbers[i + 2]
					* numbers[i + 3] + numbers[i + 4] * numbers[i + 5];
			if (currentArea > maxArea) {
				maxArea = currentArea;
			}
		}
		System.out.println(maxArea);
	}
}
