import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_2_arrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 5, 6, 7, 8 };

		// Merging two arrays using Stream
		int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();

		// Printing merged array
		System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

}
//Arrays.stream(array1) → converts first array into stream
//Arrays.stream(array2) → converts second array into stream
//IntStream.concat() → merges both streams
//toArray() → converts stream back to array