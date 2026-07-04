import java.util.Arrays;

public class Longest_strin_in_Array1 {

	// if array is not empty use 'get()' at end---
	public static void main(String[] args) {

		String[] arr = { "Java", "SpringBoot", "API", "Microservices" };

		String largest = Arrays.stream(arr).max((s1, s2) -> Integer.compare(s1.length(), s2.length())).get();

		System.out.println("Largest string: " + largest);
	}

}
