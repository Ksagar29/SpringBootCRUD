import java.util.Arrays;

public class Smallest_no_in_Array1 {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		int min = Arrays.stream(num).min().getAsInt(); // Arrays.stream(arr) → converts array into an IntStream
		System.out.println(min);

	}

}
