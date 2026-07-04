import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_odd_separator {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4);

		List<Integer> odd = l1.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		List<Integer> even = l1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

		System.out.println("odd numbers are:"+odd);
		System.out.println(even);

	}

}
