import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freq_element_in_List {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 4, 5, 6);
		Map<Integer, Long> mp = l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		mp.forEach((element, frequency) -> System.out.println(element + ":" + frequency));

	}
	// if you dont want o/p line by line then you can also remove for each loop and
	// simply write code like "Array_element_freq2"
}
