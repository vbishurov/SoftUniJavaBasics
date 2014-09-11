import java.util.Scanner;

public class SymmetricNumbersInRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start;
		int end;
		do {
			start = scanner.nextInt();
			end = scanner.nextInt();
		} while (start>end||start<0||end>999);
		scanner.close();
		for (int i = start; i < end; i++) {
			if (i<10) {
				System.out.print(i+" ");
			}
			else if ((i/100)%10==i%10&&i%10!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
