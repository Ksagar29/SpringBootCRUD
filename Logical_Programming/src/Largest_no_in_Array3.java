import java.util.Arrays;
import java.util.OptionalInt;

public class Largest_no_in_Array3 {

	// If possibility of empty array using 'OptionalInt'---

	public static void main(String[] args) {
		int[] arr = {};

		System.out.println(arr.length);

		OptionalInt max = Arrays.stream(arr).max();

		if (max.isPresent()) {
			System.out.println("Largest number: " + max.getAsInt());
		} else {
			System.out.println("Empty array");
		}

	}

}
