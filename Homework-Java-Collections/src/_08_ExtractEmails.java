import java.util.ArrayList;
import java.util.Scanner;


public class _08_ExtractEmails {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	String[] input=scanner.nextLine().split(" ");
	ArrayList<String> emails=new ArrayList<>();
	for (int i = 0; i < input.length; i++) {
		if (input[i].matches("([a-zA-Z\\-\\_\\.]+@[a-zA-z\\-\\.]+)")) {
			emails.add(input[i]);
		}
	}
	scanner.close();
	for (int i = 0; i < emails.size(); i++) {
		if (emails.get(i).endsWith(".")) {
		char[] temp=emails.get(i).toCharArray();
		temp[temp.length-1]=' ';
		emails.set(i, temp.toString());
		}
		System.out.println(emails.get(i));
	}
}
}
