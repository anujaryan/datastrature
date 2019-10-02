package twoPointer;

/**
 * @author Anuj Pachauri
 *
 *         12:08:10 am
 */
public class MiniMumSizeSum {

	public static int minSubArrayLen(int s, int[] nums) {

		int len = nums.length;
		int ans = Integer.MAX_VALUE;

		int i = 0, j = 0;
		int acc = 0;// acc is the state

		while (j < len) {
			acc += nums[j];

			while (acc >= s) {
				ans = Math.min(ans, j - i + 1);
				acc -= nums[i];
				i += 1;
			}
			j += 1;
		}

		if (ans != Integer.MAX_VALUE) {
			return ans;
		} else {
			return 0;
		}
	}

	public static void main(String str[]) {
		int s = 7;
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		System.out.println(minSubArrayLen(s, nums));
	}
}
