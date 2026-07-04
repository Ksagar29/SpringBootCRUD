import java.util.Arrays;

public class Largest_no_in_Array4 {

	// using 'Integer.MIN_VALUE'---

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4 };
		int large_no = Arrays.stream(num).max().orElse(Integer.MIN_VALUE);
		System.out.println(large_no);
	}

}
