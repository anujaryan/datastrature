package array;

/**
 * @author Anuj Pachauri
 *
 *         3:28:58 am
 */
public class UnsortestSubArray {

	public static int findUnsortestSubArray(int arr[]) {

		if (arr == null || arr.length == 0) {
			return 0;
		}

		int startIndex = -1;
		int endIndex = -1;

		int maxsofar = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < maxsofar) {
				endIndex = i;
			}
			maxsofar = Math.max(arr[i], maxsofar);
		}

		int minsofar = arr[arr.length - 1];
		for (int j = arr.length - 1; j >= 0; j--) {

			if (minsofar < arr[j]) {
				startIndex = j;
			}
			minsofar = Math.min(minsofar, arr[j]);

		}
		if (startIndex == -1 || endIndex == -1)
			return 0;

		return endIndex - startIndex + 1;
	}

	public static void main(String[] args) {
//		Input: [2, 6, 4, 8, 10, 9, 15]
//				Output: 5
//				Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order 
		// to make the whole array sorted in ascending order.

		int[] nums = { 2, 6, 4, 8, 10, 9, 15 };

		System.out.println("Sorted Sub Arrays...." + findUnsortestSubArray(nums));

	}
}
