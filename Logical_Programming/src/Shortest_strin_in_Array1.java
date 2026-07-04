import java.util.Arrays;

public class Shortest_strin_in_Array1 {

	// for Shortest string just use 'min()'---
	public static void main(String[] args) {

		String[] arr = { "Java", "SpringBoot", "API", "Microservices" };

		String largest = Arrays.stream(arr).min((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse(null);

		System.out.println("Largest string: " + largest);

	}

}
