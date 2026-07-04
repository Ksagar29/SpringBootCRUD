import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Second_largest_in_Array1 {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 8, 20, 15 };

		// Using Optional----

		Optional<Integer> secondLargest = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst(); // returns Optional<Integer>
		// Why used "boxed()"----
		// Handle Optional safely
		secondLargest.ifPresentOrElse(val -> System.out.println("Second largest: " + val),
				() -> System.out.println("No second largest element"));

	}

}
