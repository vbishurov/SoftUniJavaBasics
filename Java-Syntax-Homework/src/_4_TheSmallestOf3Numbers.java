import java.util.Locale;
import java.util.Scanner;

public class _4_TheSmallestOf3Numbers {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		if (a <= b && a <= c) {
			System.out.println(a);
		} else if (b <= a && b <= c) {
			System.out.println(b);
		} else if (c <= a && c <= b) {
			System.out.println(c);
		}
	}
}
