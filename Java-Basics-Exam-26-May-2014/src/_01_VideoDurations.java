import java.util.ArrayList;
import java.util.Scanner;

public class _01_VideoDurations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> hours=new ArrayList<>();
		ArrayList<Integer> minutes=new ArrayList<>();
		while (true)  {
			String input=scanner.nextLine();
			if (input.equals("End")) {
				break;
			}
			String[] line=input.split(":");
			hours.add(Integer.parseInt(line[0]));
			minutes.add(Integer.parseInt(line[1]));
		}
		scanner.close();
		int totalHours=0;
		int totalMinutes=0;
		for (Integer hour : hours) {
			totalHours+=hour;
		}
		for (Integer minute : minutes) {
			totalMinutes+=minute;
		}
		if (totalMinutes>=60) {
			totalHours+=totalMinutes/60;
			totalMinutes%=60;
		}
		System.out.printf("%2d:%02d",totalHours,totalMinutes);
	}
}
