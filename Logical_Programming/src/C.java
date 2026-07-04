import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C {

	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("A", "B", "B", "C", "D", "E");
		List<String> l2 = l1.stream().distinct().collect(Collectors.toList());
		System.out.println(l2);
	}
}
/**
 *  At 9th line why didnt we take List<> l1 =new arraylist<> instead of
 * arrays.AsList():- It Returns a fixed-size list , You cannot add/remove elements
 */

/**
 * new ArrayList<>(...) Returns a resizable list You can modify it freely
 */