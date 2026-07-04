import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum_of_all_digits {

	public static void main(String[] args) {

		int i = 1526;
		Integer sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sum);
	}

}
