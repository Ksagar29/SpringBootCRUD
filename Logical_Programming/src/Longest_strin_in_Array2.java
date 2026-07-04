import java.util.Arrays;

public class Longest_strin_in_Array2 {

	// if array is empty use 'orElse(null)' OR 'orElse("")'at end---
	public static void main(String[] args) {

		String[] arr = {};

		String largest = Arrays.stream(arr).max((s1, s2) -> Integer.compare(s1.length(), s2.length())).orElse(null);

		System.out.println("Largest string: " + largest);
	}

}
