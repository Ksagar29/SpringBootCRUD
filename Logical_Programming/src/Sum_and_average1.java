import java.util.Arrays;

public class Sum_and_average1 {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int sum = Arrays.stream(a).sum();
		System.out.println(sum); // for SUM---------------
//---------------------------------------------------------------------------------------------------------

		double avg = Arrays.stream(a).average().getAsDouble();
		System.out.println(avg); // for avg--------------
	}

}
// There is one catch: if the give array is empty, then you have to use 'OptionlDouble' in that case
//...to avoid 'NullpointeException'...for that refer code in next class....