/**
27-Aug-2019
Anuj Pachauri

 * 
 */
package array;

/**
 * @author Anuj Pachauri
 *
 *         10:59:01 pm
 */
public class LongestSubSequence {

	public static int longestSubSequence(int nums[]) {

		int maxlen = 1;
		int curlen = 1;
		for (int i = 1; i < nums.length; i++) {

			if (nums[i] > nums[i - 1]) {

				curlen++;
				maxlen = Math.max(maxlen, curlen);
			} else {
				curlen = 1;
			}

		}
		return maxlen;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 4, 7 };
		int[] nums1 = { 2, 2, 2, 2 };
		int[] nums3 = { 2, 1, 2, 4 };
		System.out.println("LongSubSequence Continuous :" + longestSubSequence(nums));

		System.out.println("LongSubSequence Continuous :" + longestSubSequence(nums1));

		System.out.println("LongSubSequence Continuous :" + longestSubSequence(nums3));

	}
}
