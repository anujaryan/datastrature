package math;

/**
 * @author Anuj Pachauri
 *
9:03:36 pm
 */
public class ComplementBase10FBinary {

	public static void main(String[] args) {
		int num = 8;
		System.out.println(base10Complement(num));
	}

	/**
	 * @param num
	 * @return
	 */
	private static int base10Complement(int num) {

		int temp = 0;
		int count = 0;
		while (temp < num) {

			temp += Math.pow(2, count++);

		}

		return temp - num;
	}
}
