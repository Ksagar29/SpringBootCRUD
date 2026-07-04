import java.util.Arrays;
import java.util.OptionalDouble;

public class Sum_and_average2 {

	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50 };

		// Finding sum using Stream
		int sum = Arrays.stream(numbers).sum();

		// Finding average using Stream
		OptionalDouble average = Arrays.stream(numbers).average();// to avoid 'NullpointeException' here 'OptionlDouble'
																	// is used here----

		System.out.println("Sum = " + sum);

		if (average.isPresent()) {
			System.out.println("Average = " + average.getAsDouble());
		} else {
			System.out.println("Array is empty");
		}
	}

}
