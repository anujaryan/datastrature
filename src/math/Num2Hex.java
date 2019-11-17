package math;

/**
 * @author Anuj Pachauri
 *
 *         1:50:32 am
 */
public class Num2Hex {

	public static String toHex(int nums) {

		return Integer.toHexString(nums);
	}

	public static void main(String[] args) {

		System.out.println(toHex(26));

		System.out.println(toHex(-1));

		System.out.println(toHex(0));
	}
}
