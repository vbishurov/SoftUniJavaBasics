import java.util.ArrayList;
import java.util.Scanner;

public class _02_MagicSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int divider = Integer.parseInt(scanner.nextLine());
		ArrayList<Integer> numbers = new ArrayList<>();
		while (true) {
			String line = scanner.nextLine();
			if (line.equals("End")) {
				break;
			}
			numbers.add(Integer.parseInt(line));

		}
		scanner.close();
		int counter = 0;
		int maxSum = Integer.MIN_VALUE;
		int[] indexes = new int[3];
		for (int a = 0; a < numbers.size(); a++) {
			for (int b = 0; b < numbers.size(); b++) {
				for (int c = 0; c < numbers.size(); c++) {
					if ((a!=b&&b!=c&&a!=c)&&(numbers.get(a) + numbers.get(b) + numbers.get(c))
							% divider == 0) {
						int currentSum = numbers.get(a) + numbers.get(b)
								+ numbers.get(c);
						counter++;
						if (currentSum > maxSum) {
							maxSum = currentSum;
							indexes[0] = a;
							indexes[1] = b;
							indexes[2] = c;
						}
					}
				}
			}
		}
		if (counter==0) {
			System.out.println("No");
			return;
		}
		System.out.printf("(%d + %d + %d) %% %d = 0",numbers.get(indexes[0])
				,numbers.get(indexes[1]),numbers.get(indexes[2]),divider);
	}
}
