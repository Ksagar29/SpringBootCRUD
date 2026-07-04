import java.util.stream.Collectors;

public class Anagram_String_or_Not2 {

	public static void main(String[] args) {
		String s1 = "RaceCar";
		String s2 = "CarRace";

		String str1 = s1.toUpperCase().chars().sorted().mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());

		String str2 = s2.toUpperCase().chars().sorted().mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());

		System.out.println(str1.equals(str2) ? "Anagram" : "Not Anagram");
	}

}
