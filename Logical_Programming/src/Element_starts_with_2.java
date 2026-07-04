import java.util.Arrays;

public class Element_starts_with_2 {

	public static void main(String[] args) {

		// Using 'valueOf'-

		int[] arr = { 22, 352, 256, 76, 45, 103, 372, 192 };
		Arrays.stream(arr).filter(num -> String.valueOf(num).startsWith("2")).forEach(System.out::println);
	}

}
