import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

public class _10_OrderOfProducts {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en","US"));
		ArrayList<Product> products = new ArrayList<Product>();
		ArrayList<Product> order = new ArrayList<Product>();
		BufferedReader reader;
		BufferedWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] splittedLine = line.split(" ");
				products.add(new Product(splittedLine[0], Double
						.parseDouble(splittedLine[1])));
			}
			reader = new BufferedReader(new FileReader("order.txt"));
			while ((line = reader.readLine()) != null) {
				String[] splittedLine = line.split(" ");
				order.add(new Product(splittedLine[1], Double
						.parseDouble(splittedLine[0])));
			}
			double totalPrice = 0;
			for (int i = 0; i < order.size(); i++) {
				for (int j = 0; j < products.size(); j++) {
					if (order.get(i).getName()
							.equals(products.get(j).getName())) {
						totalPrice += order.get(i).getPrice()
								* products.get(j).getPrice();
					}
				}
			}
			DecimalFormat formatter = new DecimalFormat("#.0");
		    String output = formatter.format(totalPrice);
			writer = new BufferedWriter(new FileWriter("output.txt"));
				writer.write(output);
				writer.close();
		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}
