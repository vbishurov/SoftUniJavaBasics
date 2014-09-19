import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] input=scanner.nextLine().split(" ");
		int[] numbers = new int[n];
		for (int i = 0; i < input.length; i++) {
			numbers[i]=Integer.parseInt(input[i]);
		}
		scanner.close();
		Arrays.sort(numbers);
		for (int number : numbers) {
			System.out.printf("%d ",number);
		}
	}
}
