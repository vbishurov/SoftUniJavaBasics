import java.util.ArrayList;
import java.util.Scanner;


public class _09_CombineListsOfLetters {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String[] list1=scanner.nextLine().split(" ");
	String[] list2=scanner.nextLine().split(" ");
	ArrayList<String> l1=new ArrayList<>();
	ArrayList<String> l2=new ArrayList<>();
	for (String string : list1) {
		l1.add(string);
	}
	for (String string : list2) {
		l2.add(string);
	}
	for (int i = 0; i < l2.size(); i++) {
		if (l1.contains(l2.get(i))) {
			l2.remove(i);
			i--;
		}
	}
	l1.addAll(l2);
	for (String letter : l1) {
		System.out.printf("%s ",letter);
	}
}
}
