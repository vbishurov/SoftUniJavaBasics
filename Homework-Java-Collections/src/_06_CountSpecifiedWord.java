import java.util.Scanner;


public class _06_CountSpecifiedWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("([^a-zA-z]+)");
		String wordToLookFor=scanner.nextLine();
		int counter=0;
		scanner.close();
		for (int i = 0; i < input.length; i++) {
			if (wordToLookFor.toLowerCase().equals(input[i].toLowerCase())) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
