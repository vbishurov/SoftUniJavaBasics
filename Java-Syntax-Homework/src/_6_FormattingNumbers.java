import java.util.Locale;
import java.util.Scanner;

public class _6_FormattingNumbers {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", Integer.toHexString(a)
				.toUpperCase(), String.format("%10s", Integer.toBinaryString(a))
				.replace(" ", "0"), b, c);
	}
}
