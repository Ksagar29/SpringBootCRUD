import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class String_character_freq {

	public static void main(String[] args) {

		String str = "Hello world";
		Map<String, Long> mp = Arrays.stream(str.split("")) // if i want ignore spaces {filter(ch -> !ch.equals(" "))}
															// paste this code after split()
				// {filter(ch -> !ch.trim().isEmpty())} ---Handle all whitespace (better for
				// real
				// cases)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mp);

	}
}
//.collect(...) :- This is a terminal operation: It processes the stream and converts it into a final result (here, a Map).
//groupingBy(...):- Groups elements based on a key. Returns a Map<Key, Value>.
//Function.identity() :- Means: use the element itself as the 'key'
//Collectors.counting():- Counts how many elements fall into each group.

//----------------------------------------------------------------------------------------------------------
//" " (space) means: split the string wherever there is a space i.e. Word count
//"" The empty string means: split between every character i.e. Character count
// how to ignore spaces
//how to make it case-insensitive- for that {Arrays.stream(str.toLowerCase().split(""))}
//or how to do the same without streams (classic loop)
