/**
08-Aug-2019
Dell

 * 
 */
package leetcode;

/**
 * @author Dell
 *
 *         11:45:19 pm
 */
public class AlternateBits {

	public static boolean hasAlternate(Integer nums) {
		if (nums == 0) {
			return false;
		}
		String bi = Integer.toBinaryString(nums);
		char[] biarr = bi.toCharArray();

		for (int i = 0; i < biarr.length - 1; i++) {

			if (biarr[i] == biarr[i + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] str) {
		int num = 0;

		System.out.println(hasAlternate(num));
	}

}
