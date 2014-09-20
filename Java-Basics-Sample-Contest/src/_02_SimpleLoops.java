import java.math.BigInteger;
import java.util.Scanner;

public class _02_SimpleLoops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger t1 = scanner.nextBigInteger();
		BigInteger t2 = scanner.nextBigInteger();
		BigInteger t3 = scanner.nextBigInteger();
		int n = scanner.nextInt();
		scanner.close();
		if (n == 1) {
			System.out.println(t1);
			return;
		}
		else if (n == 2) {
			System.out.println(t2);
			return;
		}
		else if (n == 3) {
			System.out.println(t3);
			return;
		}
		BigInteger sum = BigInteger.ZERO;
		for (int i = 0; i < n - 3; i++) {
			sum = BigInteger.ZERO.add(t1);
			sum = sum.add(t2);
			sum = sum.add(t3);
			t1 = t2;
			t2 = t3;
			t3 = sum;
		}
		System.out.println(sum);
	}
}
