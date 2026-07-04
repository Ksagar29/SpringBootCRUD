import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Min_Max_no2 {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> max = l1.stream().sorted(Comparator.reverseOrder()).limit(1).toList();
		List<Integer> min = l1.stream().sorted(Comparator.naturalOrder()).limit(1).toList();

		System.out.println(max);
		System.out.println(min);

	}

}
