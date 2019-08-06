/**
04-Aug-2019
Dell

 * 
 */
package array;

/**
 * @author Dell
 *
 *         6:11:39 pm
 */
public class SingleNumber {

	public static void main(String[] args) {

		// int nums[] = { 2, 2, 1 };
		int nums[] = { 4, 1, 2, 1, 2 };

		System.out.println("Single number in arrays is:" + singleNumber(nums));

	}

	/**
	 * @param nums
	 * @return
	 */
	private static int singleNumber(int[] nums) {

		int x = 0;
		for (int n : nums) {
			x = x ^ n;
		}
		return x;
//		Set<Integer> set = new HashSet<>();
//		for (int i = 0; i < nums.length; i++) {
//
//			if (set.contains(nums[i])) {
//				set.remove(nums[i]);
//			} else {
//				set.add(nums[i]);
//			}
//		}
//
//		System.out.println(set.size());
//		int ret = 0;
//		for (int i : set) {
//			ret = i;
//			System.out.println(ret);
//		}
//
//		return ret;
	}

}
