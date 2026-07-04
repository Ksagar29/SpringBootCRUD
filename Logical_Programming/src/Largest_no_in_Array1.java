import java.util.Arrays;

public class Largest_no_in_Array1 {

	// Normal way but if array empty not able to handle---

	public static void main(String[] args) {

		int[] arr = { 10, 25, 7, 89, 56 };

		int max = Arrays.stream(arr).max().getAsInt();

		System.out.println("Largest number: " + max);

	}

}
