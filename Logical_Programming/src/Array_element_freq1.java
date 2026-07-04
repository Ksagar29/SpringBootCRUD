import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Array_element_freq1 {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 2, 3, 4, 5 };
		Map<Integer, Long> mp = Arrays.stream(arr)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		mp.forEach((element, frequency) -> System.out.println(element + ":" + frequency));
		// Iterates over each entry in the map:- element → key & frequency → value
		// we have used for-Each loop here to get o/p line by line

	}

}
