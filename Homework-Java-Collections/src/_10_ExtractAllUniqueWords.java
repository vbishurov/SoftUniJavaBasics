import java.util.Scanner;
import java.util.TreeSet;

public class _10_ExtractAllUniqueWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("[^A-Za-z0-9_]+");
		scanner.close();
		TreeSet<String> unique = new TreeSet<>();
		for (String word : input) {
			unique.add(word.toLowerCase());
		}
		for (String word : unique) {
			System.out.printf("%s ", word);
		}
		System.out.println();
	}
}
