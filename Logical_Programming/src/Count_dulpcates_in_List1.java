import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_dulpcates_in_List1 {

	public static void main(String[] args) {
		String st = "my name is name";

		Arrays.stream(st.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " repeated " + entry.getValue() + " times"));

	}

}
