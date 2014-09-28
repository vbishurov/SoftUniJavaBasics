import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_NutsVersion2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeMap<String, LinkedHashMap<String, String>> companies=new TreeMap<>();
		int n=Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			String[] line=scanner.nextLine().split(" ");
			if (companies.containsKey(line[0])) {
				LinkedHashMap<String, String> value=companies.get(line[0]);
				if (value.containsKey(line[1])) {
					int oldKg=Integer.parseInt(value.get(line[1]).
							substring(0,value.get(line[1]).length()-2));
					int newKg=Integer.parseInt(line[2].substring(0,line[2].length()-2))+oldKg;
					String newKgString=newKg+"kg";
					value.put(line[1], newKgString);
				}
				else {
					value.put(line[1], line[2]);
				}
				companies.put(line[0], value);
			}
			else {
				LinkedHashMap<String, String> value=new LinkedHashMap<>();
				value.put(line[1], line[2]);
				companies.put(line[0], value);
			}
		}
		scanner.close();
		for (String key : companies.keySet()) {
			String amounts=new String();
			for (String valueKey : companies.get(key).keySet()) {
				amounts+=" "+valueKey+"-"+companies.get(key).get(valueKey)+",";
			}
			amounts=amounts.substring(0, amounts.length()-1);
				System.out.printf("%s:%s%n",key,amounts);	
		}
	}
}
