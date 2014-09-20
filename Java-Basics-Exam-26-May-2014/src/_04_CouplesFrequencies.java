import java.util.LinkedHashMap;
import java.util.Scanner;

public class _04_CouplesFrequencies {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		scanner.close();
		int[] numbers = new int[input.length];
		int couples = numbers.length - 1;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
		LinkedHashMap<String, Double> frequencies = new LinkedHashMap<>();
		for (int i = 0; i < numbers.length - 1; i++) {
			Double count=frequencies.get(numbers[i]+" "+numbers[i+1]);
			if (count==null) {
				count=0D;
			}
			frequencies.put(numbers[i]+" "+numbers[i+1], count+1);
		}
		for (String key : frequencies.keySet()) {
			Double count=frequencies.get(key);
			frequencies.put(key, count/couples*100);
		}
		for (String key : frequencies.keySet()) {
			System.out.printf("%s -> %.2f%%%n",key,frequencies.get(key));
		}
	}
}
