package math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         10:02:25 pm
 */
public class SelfDividingNumber {

	public static List<Integer> selfDividingNumber(int lower, int upper) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = lower; i <= upper; i++) {

			if (isDivideNumber(i)) {
				list.add(i);
			}

		}

		return list;
	}

	/**
	 * @param i
	 * @return
	 */
	private static boolean isDivideNumber(int i) {

		int temp = i;

		while (temp != 0) {

			int rem = temp % 10; // digit Extracted
			if (rem == 0) {
				return false;
			} else if (i % rem != 0) {
				return false;
			}
			temp /= 10;
		}

		return true;
	}

	public static void main(String[] args) {
		int lower = 66, upper = 708;

		selfDividingNumber(lower, upper).stream().forEach(x -> System.out.print(x + " "));
	}
}
