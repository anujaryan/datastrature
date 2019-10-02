package array;

/**
 * @author Anuj Pachauri
 *
 *         10:34:13 pm
 */
public class CountBits {

	public static short countBits(int n) {

		short numBits = 0;
		while (n != 0) {

			numBits += (n & 1);
			n >>>= 1;
		}
		return numBits;
	}

	public static void main(String[] args) {

		System.out.println(countBits(10));
	}
}
