import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Array_element_freq2 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 2, 3, 4, 5 };

		Map<Integer, Long> mp = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(mp);
	}
	// in this code we 'haven't' used for-Each loop, So will get o/p in single line
	// not in separate line thats it

}
