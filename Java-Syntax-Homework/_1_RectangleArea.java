import java.util.Scanner;

public class _1_RectangleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int area = a * b;
		System.out.println(area);
	}
}
