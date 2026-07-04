import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_duplicates_in_array2 {

	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 30, 40, 20, 50, 30, 60, 10 }; // Using Integer[]arr---by using this we dont need to
																// use boxed();

		Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);

	}

}
//Use of boxed(): It converts a primitive stream into an object stream.
//int[] arr = { 10, 20, 30 };----This peace of code with "int[]" produces 'IntStream'
//Arrays.stream(arr)
//But But methods like: Collectors.groupingBy(...)--work with Stream<T> (objects), not primitive streams like IntStream.
//So, when we use boxed()- to convert 'IntStream  →  Stream<Integer>'
//i.e. Arrays.stream(arr).boxed()-Now the stream elements become Integer objects, and groupingBy() can use them.
//Without boxed(): This will NOT compile:
//Simple analogy:-
//int = primitive datatype
//Integer = wrapper object--boxed() wraps primitive values into objects.
//| Array Type  | Stream Type       | Need `boxed()`? |
//| ----------- | ----------------- | --------------- |
//| `int[]`     | `IntStream`       | Yes             |
//| `Integer[]` | `Stream<Integer>` | No              |
// i.e when you use int[]- u need to use boxed()
// & when u use Integer[]- no need to use boxed()
