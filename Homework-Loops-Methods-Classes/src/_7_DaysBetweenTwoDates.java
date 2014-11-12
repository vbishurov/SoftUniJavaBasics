import java.util.Scanner;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class _7_DaysBetweenTwoDates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy");
		LocalDate start = LocalDate.parse(scanner.nextLine(), formatter);
		LocalDate end = LocalDate.parse(scanner.nextLine(), formatter);
		scanner.close();
		int difference = Days.daysBetween(start, end).getDays();
		System.out.println(difference);
	}
}
