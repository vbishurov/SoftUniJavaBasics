import java.util.Locale;
import java.util.Scanner;

public class _9_PointsInsideTheHouse {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		input.close();
		if (isInTriangle(x, y)) {
			System.out.println("Inside");
		}
		else if ((x>=12.5&&x<=17.5)&&(y>=8.5&&y<=13.5)) {
			System.out.println("Inside");
		}
		else if ((x>=20&&x<=22.5)&&(y>=8.5&&y<=13.5)) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}

	}

	private static boolean isInTriangle(double x3, double y3) {
		double x1 = 12.5, y1 = 8.5;
		double x2 = 17.5, y2 = 3.5;
		double x4 = 22.5, y4 = 8.5;
		if ((((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1))) >= 0
				&& (((x2 - x4) * (y3 - y4)) - ((x3 - x4) * (y2 - y4))) <= 0) {
			return true;
		}
		return false;
	}
}
