import java.util.Scanner;

public class Generate3LetterWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String chars=scanner.nextLine();
		scanner.close();
		for (int i = 0; i < chars.length(); i++) {
			for (int j = 0; j < chars.length(); j++) {
				for (int q = 0; q < chars.length(); q++) {
					StringBuilder word = new StringBuilder();
					word.append(chars.charAt(i)).append(chars.charAt(j)).append(chars.charAt(q));
					System.out.print(word+" ");
				}
			}
		}
	}
}
