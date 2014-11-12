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
		double temp= Math.min(a, b);
		double smallest=Math.min(temp, c);
		System.out.println(new Float(smallest).toString().replaceAll("\\.0", ""));
	}
}
