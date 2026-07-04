import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class a2b3c4 {

	public static void main(String[] args) {

		String s1 = "aabbbccccs";
		String s2 = Arrays.stream(s1.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.map(e -> e.getKey() + "" + e.getValue()).collect(Collectors.joining());
		System.out.println(s2);

	}

}// if you want order to be preserved then use this:
//because groupingBy() uses 'HashMap' by default.
/**
 * Arrays.stream(s1.split("")) .collect(Collectors.groupingBy(
 * Function.identity(), LinkedHashMap::new, Collectors.counting()))
 */