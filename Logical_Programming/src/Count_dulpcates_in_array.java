import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_dulpcates_in_array {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 2, 4, 5, 2, 1 };

		Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " repeated " + entry.getValue() + " times"));

	}

}
