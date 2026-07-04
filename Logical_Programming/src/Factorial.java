import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factorial {

	public static void main(String[] args) {

		int n = 5;

		int factorial = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);

		System.out.println("Factorial: " + factorial);
	}
}
// Do it with Scanner.................