import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_Min_Max_3_nos1 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 4, 3);
		l1.stream().sorted().limit(3).forEach(System.out::println);
		l1.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	}

}
