import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates_remove {

	public static void main(String[] args) {

		Integer[] arr = new Integer[] { 1, 2, 3, 4, 4, 5, 4, 2, 9 };
		List<Integer> l1 = Arrays.asList(arr); //Arrays.asList(arr) converts the array into a List
		Set<Integer> s1 = l1.stream().collect(Collectors.toSet());//l1.stream():Converts the list into a stream
		
		System.out.println(s1);
	}

}
