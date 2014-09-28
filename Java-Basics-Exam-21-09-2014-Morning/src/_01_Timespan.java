import java.util.Scanner;

public class _01_Timespan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] end = scanner.nextLine().split(":");
		String[] start = scanner.nextLine().split(":");
		scanner.close();
		int startHours=Integer.parseInt(start[0]);
		int startMinutes=Integer.parseInt(start[1]);
		int startSeconds=Integer.parseInt(start[2]);
		int endHours=Integer.parseInt(end[0]);
		int endMinutes=Integer.parseInt(end[1]);
		int endSeconds=Integer.parseInt(end[2]);
		int diffHours=0;
		int diffMinutes=0;
		int diffSeconds=0;
		if (endSeconds<startSeconds) {
			endSeconds+=60;
			endMinutes--;
		}
		diffSeconds=endSeconds-startSeconds;
		if (endMinutes<startMinutes) {
			endMinutes+=60;
			endHours--;
		}
		diffMinutes=endMinutes-startMinutes;
		diffHours=endHours-startHours;
		System.out.printf("%d:%02d:%02d",diffHours,diffMinutes,diffSeconds);
	}
}
