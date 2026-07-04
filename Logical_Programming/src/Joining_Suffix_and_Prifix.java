import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining_Suffix_and_Prifix {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Java", "Python", "C++", "Spring");
		// ", " → separator between elements
		// "[" → prefix
		// "]" → suffix

		String result = names.stream().collect(Collectors.joining(", ", "[", "]"));

		System.out.println("Joined String: " + result);
	}

}
