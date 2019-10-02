package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         10:06:58 pm
 */
public class ParitySort {

	public static int[] sortArrayParity(int nums[]) {

		int len = nums.length;
		int temp[] = new int[len];
		int k = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] % 2 == 0) {
				temp[k++] = nums[i];
			}
		}
		for (int i = 0; i < len; i++) {
			if (nums[i] % 2 == 1) {
				temp[k++] = nums[i];
			}
		}

		return temp;
	}

	public static void main(String[] args) {

		int nums[] = { 3, 1, 2, 4 };
		int nums1[] = { 0, 1 };
		System.out.println(0 % 2);

		System.out.println(Arrays.toString(sortArrayParity(nums)));
		System.out.println(Arrays.toString(sortArrayParity(nums1)));

	}
}
