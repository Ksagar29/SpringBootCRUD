import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_dulpcates_in_List2 {

	public static void main(String[] args) {
		String st = "my name is name";
		Map<String, Long> mp = Arrays.stream(st.toLowerCase().split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		mp.entrySet().stream().filter(e -> e.getValue() > 1)
				.forEach(e -> System.out.println("word:" + e.getKey() + ",count:" + e.getValue()));
	}

}
// If you want to ignore spaces:- filter() method need to be add as below---
/**
 * Map<String, Long> mp = Arrays.stream(st.toLowerCase().split("")) .filter(ch
 * -> !ch.equals(" ")) .collect(Collectors.groupingBy( Function.identity(),
 * Collectors.counting()));
 */