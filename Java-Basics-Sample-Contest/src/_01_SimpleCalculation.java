import java.util.Scanner;

public class _01_SimpleCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = Double.parseDouble(scanner.nextLine());
		double y = Double.parseDouble(scanner.nextLine());
		scanner.close();
		int location=Integer.MIN_VALUE;
		if (x==0&&y==0) {
			location=0;
		}
		else if (x==0&&y!=0) {
			location=5;
		}
		else if (x!=0&&y==0) {
			location=6;
		}
		else if (x>0&&y>0) {
			location=1;
		}
		else if (x>0&&y<0) {
			location=4;
		}
		else if (x<0&&y>0) {
			location=2;
		}
		else if (x<0&&y<0) {
			location=3;
		}
		System.out.println(location);
	}
}
