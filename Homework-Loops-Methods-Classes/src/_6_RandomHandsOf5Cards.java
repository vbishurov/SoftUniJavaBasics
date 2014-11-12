import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _6_RandomHandsOf5Cards {
	public static void main(String[] args) {
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] suits = { '\u2663', '\u2666', '\u2665', '\u2660' };
		ArrayList<String> cards = new ArrayList<>();
		for (String face : faces) {
			for (char suit : suits) {
				cards.add(face + suit);
			}
		}
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		scanner.close();
		for (int i = 0; i < n; i++) {
			System.out.println(GenerateRandomHand(cards));
		}
	}

	private static String GenerateRandomHand(ArrayList<String> cards) {
		Random randomCard = new Random();
		String card1 = cards.get(randomCard.nextInt(52));
		String card2 = cards.get(randomCard.nextInt(52));
		while (card2.equals(card1)) {
			card2 = cards.get(randomCard.nextInt(52));
		}
		String card3 = cards.get(randomCard.nextInt(52));
		while (card3.equals(card1) || card3.equals(card2)) {
			card3 = cards.get(randomCard.nextInt(52));
		}
		String card4 = cards.get(randomCard.nextInt(52));
		while (card4.equals(card1) || card4.equals(card2)
				|| card4.equals(card3)) {
			card4 = cards.get(randomCard.nextInt(52));
		}
		String card5 = cards.get(randomCard.nextInt(52));
		while (card5.equals(card1) || card5.equals(card2)
				|| card5.equals(card3) || card5.equals(card4)) {
			card5 = cards.get(randomCard.nextInt(52));
		}
		return new String("" + card1 + " " + card2 + " " + card3 + " " + card4
				+ " " + card5);
	}
}
