import java.util.Scanner;

public class _05_CountAllWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("([^a-zA-z]+)");
		scanner.close();
		System.out.println(input.length);
	}
}
