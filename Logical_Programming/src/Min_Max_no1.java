import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Min_Max_no1 {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
		int max = l1.stream().max(Comparator.naturalOrder()).get();
		int min = l1.stream().min(Comparator.naturalOrder()).get();

		System.out.println(max);
		System.out.println(min);
	}

}
