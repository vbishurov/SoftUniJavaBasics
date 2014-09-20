import java.util.LinkedHashMap;
import java.util.Scanner;

public class _12_CardsFrequencies {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] cards = scanner.nextLine().split("[^1-9JQKA0?]+");
		scanner.close();
		LinkedHashMap<String, Integer> values=new LinkedHashMap<>();
		int apperances=0;
		for (String card : cards) {
			Integer value=values.get(card);
			if (value==null) {
				value=0;
			}
			values.put(card, value+1);
			apperances++;
		}
		LinkedHashMap<String, Double> frequencies=new LinkedHashMap<String, Double>();
		for (String card : values.keySet()) {
			double value=values.get(card);
			value=value/apperances*100;
			frequencies.put(card, value);
		}
		for (String frequency : frequencies.keySet()) {
			System.out.printf("%s -> %.2f%% %n",frequency,frequencies.get(frequency));
		}
	}
}
