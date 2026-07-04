import java.util.Arrays;

public class Largest_no_in_Array2 {

	// shorter code using 'orElse()':

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int max = Arrays.stream(arr).max().orElse(-1); // default value: Here -1 will be returned if the array is empty.

		System.out.println(max);
	}

}
