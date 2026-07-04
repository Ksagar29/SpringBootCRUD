import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_Min_Max_3_nos2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 45, 7, 89, 23, 56, 2, 91);

		// Minimum 3 numbers
		List<Integer> min3 = list.stream().sorted().limit(3).toList();

		// Maximum 3 numbers
		List<Integer> max3 = list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println("Minimum 3 numbers: " + min3);
		System.out.println("Maximum 3 numbers: " + max3);
	}

}
