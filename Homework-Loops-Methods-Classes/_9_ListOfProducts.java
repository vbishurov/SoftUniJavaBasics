import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class _9_ListOfProducts {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
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
			Collections.sort(products);

			writer = new BufferedWriter(new FileWriter("output.txt"));
			for (Product product : products) {
				writer.write(product.getName() + " " + product.getPrice()
						+ "\r\n");
			}
			writer.close();
		} catch (Exception e) {
			System.err.println("Error");
		}
	}
}
