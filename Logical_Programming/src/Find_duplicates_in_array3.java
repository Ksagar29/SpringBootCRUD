import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * If you want to store duplicates in a List---
 */
public class Find_duplicates_in_array3 {

	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 30, 40, 20, 50, 30, 60, 10 };
		List<Integer> duplicates = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(duplicates);

	}

}
