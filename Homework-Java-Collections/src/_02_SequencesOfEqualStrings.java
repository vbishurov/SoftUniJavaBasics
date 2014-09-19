import java.util.Scanner;


public class _02_SequencesOfEqualStrings {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] input=scanner.nextLine().split(" ");
	String currentSequence=null;
	scanner.close();
	for (int i = 0; i < input.length; i++) {
		currentSequence=input[i];
		while (i<input.length-1&&input[i].equals(input[i+1])) {
			currentSequence+=" "+input[i+1];
			i++;
		}
		System.out.println(currentSequence);
	}
}
}
