import java.util.Scanner;


public class _5_DecimalToHexademical {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		String hex = Integer.toHexString(num);
		System.out.println(hex);
	}
}
