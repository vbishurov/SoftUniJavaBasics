import java.util.Arrays;
import java.util.Scanner;


public class _4_SortArrayOfStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.next();
		}
		scan.close();
		Arrays.sort(arr);
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
