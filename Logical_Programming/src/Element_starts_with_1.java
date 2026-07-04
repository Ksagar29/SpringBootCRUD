import java.util.Arrays;

public class Element_starts_with_1 {

	public static void main(String[] args) {

		// Using 'mapToObj'-

		int[] arr = { 22, 352, 256, 76, 45, 103, 372, 192 };
		Arrays.stream(arr).mapToObj(Integer::toString).filter(i -> i.startsWith("1")).forEach(System.out::println);

	} // mapToObj- Converts numbers to String immediately i.e. 156->"156"

}

/**
 * Arrays.stream(arr) .filter(num -> String.valueOf(num).startsWith("1"))
 * .forEach(System.out::println);--->"This avoids converting the whole stream
 * into String"(when we used 'valueOf()')
 */