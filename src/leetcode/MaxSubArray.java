/**
24-Jul-2019
Dell

 * 
 */
package leetcode;

/**
 * @author Dell
 *
 *         11:59:01 pm
 */
public class MaxSubArray {

	public static int subArrayMax(int arr[]) {

		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException();
		}

		int maxEndinghere = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			maxEndinghere = Math.max(maxEndinghere + arr[i], arr[i]);
			maxSum = Math.max(maxEndinghere, maxSum);
		}

		return maxSum;
	}

	public static void main(String args[]) {

		int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(subArrayMax(arr));

	}
}
