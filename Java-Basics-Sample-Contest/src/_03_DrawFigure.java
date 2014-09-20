import java.util.Arrays;
import java.util.Scanner;

public class _03_DrawFigure {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n=Integer.parseInt(scanner.nextLine());
	scanner.close();
	for (int i = 0; i < n; i++) {
		String dots=new String();
		String asterisks=new String();
		if (i<=n/2) {
			dots=createString(i, '.');
			asterisks=createString(n-i*2, '*');
		}
		else {
			dots=createString(n-i-1, '.');
			asterisks=createString(n-(n-i-1)*2, '*');
		}
		System.out.printf("%s%s%s%n",dots,asterisks,dots);
	}

}

	public static String createString(int length, char ch) {
		char[] chars = new char[length];
		Arrays.fill(chars, ch);
		return new String(chars);
	}
}
