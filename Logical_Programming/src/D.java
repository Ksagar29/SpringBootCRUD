import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D {

	public static void main(String[] args) {

		// Initialize (copy) one ArrayList into another and use 'FlatMap' on it:
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5);
		List<Integer> l3 = Arrays.asList(6, 7, 8);

		// Create list of lists
		List<List<Integer>> nestedList = Arrays.asList(l1, l2, l3);
		System.out.println(nestedList);
		// Flatten using flatMap
		List<Integer> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println("Flattened List: " + flatList);
	}
}