import java.util.Scanner;

public class _07_CountSubstringOccurances {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("([^a-zA-z]+)");
		String wordToLookFor = scanner.nextLine();
		int counter = 0;
		scanner.close();
		for (int i = 0; i < input.length; i++) {
			if (input[i].toLowerCase().contains(wordToLookFor.toLowerCase())) {
				char[] word = input[i].toLowerCase().toCharArray();
				char[] searchedWord = wordToLookFor.toLowerCase().toCharArray();
				for (int j = 0; j < word.length-searchedWord.length+1; j++) {
					boolean contains=true;
					for (int j2 = 0; j2 < searchedWord.length; j2++) {
						if (searchedWord[j2]==word[j+j2]) {
							continue;
						}
						else {
							contains=false;
						}
					}
					if (contains) {
						counter++;
					}
				}
			}
		}
		System.out.println(counter);
	}
}
