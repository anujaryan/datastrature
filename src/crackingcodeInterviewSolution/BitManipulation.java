/**
05-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         2:26:12 PM
 */
public class BitManipulation {

	public static void main(String str[]) {

		int a = 103219;
		System.out.println(AssertMethod.tofullBinaryString(a));
		int b = 13;
		System.out.println(AssertMethod.tofullBinaryString(b));

		int c = updateBits(a, b, 4, 7);
	}

	/**
	 * @param a
	 * @param b
	 * @param i
	 * @param j
	 * @return
	 */
	private static int updateBits(int a, int b, int i, int j) {

		int max = ~0; // all 1' s /
		System.out.println(" Max value is : " + max);

		// 1 's through position j, then 0's
		int left = max - ((1 << i) - 1);

		// 1's after position i
		int right = ((1 << i) - 1);

		// 1's , with 0s between i and j

		int mask = left | right;

		// clear i through j , then put b in a
		return (a & mask) | (b << i);
	}

}

class AssertMethod {

	public static String tofullBinaryString(int a) {

		String s = "";
		for (int i = 0; i < 32; i++) {
			Integer lbs = new Integer(a & 1);
			s = lbs.toString() + s;
			a = a >> 1;
		}

		return s;
	}

}