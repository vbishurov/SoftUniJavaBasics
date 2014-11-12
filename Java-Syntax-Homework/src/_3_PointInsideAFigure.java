import java.util.Locale;
import java.util.Scanner;

public class _3_PointInsideAFigure {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
			Scanner scanner = new Scanner(System.in);
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			scanner.close();
			if (a >= 12.5 && a <= 17.5 && b >= 8.5 && b <= 13.5) {
				System.out.println("Inside");
			} else if (a >= 12.5 && a <= 22.5 && b >= 6 && b <= 8.5) {
				System.out.println("Inside");
			} else if (a >= 20 && a <= 22.5 && b >= 8.5 && b <= 13) {
				System.out.println("Inside");
			} else {
				System.out.println("Outside");
			}
	}
}
