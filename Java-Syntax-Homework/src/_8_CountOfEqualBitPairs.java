import java.util.Scanner;

public class _8_CountOfEqualBitPairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		char[] binary = Integer.toBinaryString(n).toCharArray();
		int counter = 0;
		for (int i = 0; i < binary.length-1; i++) {
			if (binary[i]==binary[i+1]) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
