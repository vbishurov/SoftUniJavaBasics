import java.util.Scanner;
import java.util.TreeMap;

public class _11_MostFrequentWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split("[^A-Za-z0-9_]+");
		scanner.close();
		TreeMap<String, Integer> frequencies = new TreeMap<>();
		for (String word : input) {
			  Integer count = frequencies.get(word);
			  if (count == null) {
			    count = 0; 
			  }
			  frequencies.put(word.toLowerCase(), count+1);
			}

		int maxValue=Integer.MIN_VALUE;
		for (Integer value : frequencies.values()) {
			if (value>maxValue) {
				maxValue=value;
			}
		}
		for (String key : frequencies.keySet()) {
			if (frequencies.get(key).intValue()==maxValue) {
				System.out.printf("%s -> %d times%n",key,frequencies.get(key));
			}
		}
	}
}
