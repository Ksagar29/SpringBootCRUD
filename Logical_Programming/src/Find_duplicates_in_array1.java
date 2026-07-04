import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_duplicates_in_array1 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 20, 50, 30, 60, 10 };// Using int[] arr-by using this we need to use boxed()
															// method
															// here;

		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);
	}

}
