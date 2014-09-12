import java.util.Scanner;

public class _5_AngleConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			String[] angle = scanner.nextLine().split(" ");
			if (angle[1].equals("deg")) {
				ConvertDegreesToRadians(angle[0]);
			} else {
				ConvertRadiansToDegrees(angle[0]);
			}
		}
		scanner.close();
	}

	private static void ConvertRadiansToDegrees(String radians) {
		double rads = Double.parseDouble(radians);
		double degrees = rads * 180 / Math.PI;
		System.out.printf("%.6f deg\n", degrees);
	}

	private static void ConvertDegreesToRadians(String degrees) {
		double deg = Double.parseDouble(degrees);
		double rads = deg * Math.PI / 180;
		System.out.printf("%.6f rad\n", rads);
	}
}
