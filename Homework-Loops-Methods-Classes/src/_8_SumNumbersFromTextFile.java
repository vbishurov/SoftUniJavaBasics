import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class _8_SumNumbersFromTextFile {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("input.txt"));
			ArrayList<Integer> numbers = new ArrayList<>();
			while (scanner.hasNextInt()) {
				numbers.add(scanner.nextInt());
			}
			scanner.close();
			int sum = 0;
			for (Integer number : numbers) {
				sum += number;
			}
			System.out.println(sum);
		} catch (FileNotFoundException missing) {
			System.err.println("Error");
		}
	}
}
