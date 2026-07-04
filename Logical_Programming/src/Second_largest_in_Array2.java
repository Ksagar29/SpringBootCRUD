import java.util.Arrays;
import java.util.Comparator;

public class Second_largest_in_Array2 {

	public static void main(String[] args) {

		// Without Optional----

		int[] arr = { 10, 5, 20, 8, 20, 15 };
		int secondlargest = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println(secondlargest);
	}

}
// if you are sure that there will be 2nd largest element then use int secondlargest with .get() at last, if not use Optional<Integer>