import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Second_largest_in_List1 {

	public static void main(String[] args) {

		// Without Optional----
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);

		Integer second_largest = l1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

		System.out.println(second_largest); // @ line 12 you can also use 'int' instead of 'Integer';

	}

}
