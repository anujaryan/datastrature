package bitmanipulation;

/**
 * @author Anuj Pachauri
 *
 *         12:17:22 am
 */
public class SingleNumber2 {

	public static void main(String[] args) {

		int[] nums2 = { 2, 2, 3, 2 };

		int[] nums1 = { 2, 2, 3 };
		System.out.println(singleNumber2(nums2));
		System.out.println(singleNumber(nums1));
	}

	public static int singleNumber2(int[] nums) {

		int a = 0, b = 0;
		for (int i = 0; i < nums.length; i++) {

			a = a ^ nums[i] & ~b;

			b = b ^ nums[i] & ~a;

		}

		return a | b;
	}

	public static int singleNumber(int[] nums) {
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			a = a ^ nums[i];

		}

		return a;
	}
}
