import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _2_CurrentDateTime {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter
				.ofPattern("dd.MM.yyyy HH:mm");
		String time = formatter.format(LocalDateTime.now());
		System.out.println(time); 
	}
}
