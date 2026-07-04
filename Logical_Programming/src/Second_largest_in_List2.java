import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Second_largest_in_List2 {

	public static void main(String[] args) {

		// Using Optional:
		List<Integer> l1 = Arrays.asList(10, 5, 20, 8, 20, 15);
		Optional<Integer> secondLargest = l1.stream().distinct() // remove duplicates
				.sorted(Comparator.reverseOrder()) // sort descending
				.skip(1) // skip the largest
				.findFirst(); // get second largest

		if (secondLargest.isPresent()) {
			System.out.println("Second largest number: " + secondLargest.get());
		} else {
			System.out.println("Second largest not found");
		}
		// **Why Optional(safe handling):- This is intentional—because sometimes 
		// there is no second largest value.
		// List<Integer> numbers = Arrays.asList(10);---only one element
		// List<Integer> numbers2 = Arrays.asList(5, 5, 5);---all duplicates
		// **Without Optional (bad practice):-If Java returned a plain Integer, it might
		// return null, which can lead to:
		// ❌ NullPointerException
	}

}
