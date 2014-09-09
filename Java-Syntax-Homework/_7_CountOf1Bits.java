import java.util.Scanner;

public class _7_CountOf1Bits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		char[] binary = Integer.toBinaryString(n).toCharArray();
		int counter = 0;
		for (int i = 0; i < binary.length; i++) {
			if (binary[i] == '1') {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
