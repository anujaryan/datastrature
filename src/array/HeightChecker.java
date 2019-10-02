/**
26-Aug-2019
Anuj Pachauri

 * 
 */
package array;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         11:42:49 pm
 */
public class HeightChecker {

	public static int heightChecker(int[] heights) {

		final int[] ordered = Arrays.copyOf(heights, heights.length);

		Arrays.sort(ordered);
		int unordered = 0;
		for (int i = 0; i < heights.length; i++) {

			if (heights[i] != ordered[i]) {
				unordered++;
			}

		}

		return unordered;

	}

	public static void main(String[] args) {

		int heights[] = { 1, 1, 4, 2, 1, 3 };

		int height[] = { 23, 52, 46, 7, 50, 87, 20, 32, 85, 65, 62, 34, 8, 86, 15, 66, 66, 30, 11, 96, 18, 26, 24, 10,
				57, 13, 37, 69, 85, 6, 8, 17, 40, 88, 14, 72, 85, 51, 40, 38, 54, 65, 65, 27, 18, 59, 77, 12, 25, 46,
				10, 19, 10, 28, 64, 79, 5, 88, 2, 1, 14, 50, 91, 34, 58, 32, 90, 67, 28, 81, 84, 76, 88, 45, 42, 54, 59,
				56, 20, 6, 56, 51, 72, 69, 6, 48, 67, 68, 6, 10, 93, 69, 4, 29, 28 };

		System.out.println("Number Students are not in right position : " + heightChecker(heights));

		System.out.println("Number Students are not in right position : " + checkHeightbyCountingSort(height));

	}

	public static int checkHeightbyCountingSort(int height[]) {

		int[] bucket = createBucket(height);

		int outOfOrder = 0;
		int nextInBucket = 0;
		for (int i = 0; i < height.length; i++) {

			nextInBucket = nextValidNumber(bucket, nextInBucket);

			if (height[i] != nextInBucket) {
				outOfOrder++;
			}
			bucket[nextInBucket]--;
		}
		return outOfOrder;

	}

	/**
	 * @param bucket
	 * @param nextInBucket
	 * @return
	 */
	private static int nextValidNumber(int[] bucket, int currentNumber) {

		while (bucket[currentNumber] == 0) {
			currentNumber++;

		}

		return currentNumber;
	}

	/**
	 * @param height
	 * @return
	 */
	private static int[] createBucket(int[] height) {

		int bucket[] = new int[101];

		for (int num : height) {

			bucket[num]++;
		}

		return bucket;
	}

}
