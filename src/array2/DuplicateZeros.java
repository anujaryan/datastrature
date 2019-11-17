package array2;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         10:04:52 pm
 */
public class DuplicateZeros {

	public static void duplicateZeros(int nums[]) {

		int len = nums.length;
		int[] temp = new int[len];
		int k = 0;
		for (int i = 0; i < len; i++) {

			if (nums[i] == 0) {
				temp[k] = nums[i];
				k++;
				temp[k] = 0;
				k++;
			} else {
				temp[k] = nums[i];
				k++;
			}

			if (k > len - 1) {
				break;
			}
		}
		nums = temp;
		System.out.println();
		Arrays.stream(nums).forEach(s -> System.out.print(s + " "));
	}

	public static void main(String[] args) {

		int nums[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
		int nums2[] = { 1, 2, 3 };
		int nums3[] = { 0, 0, 0, 0, 0, 0, 0 };

		duplicateZeros2(nums);
		duplicateZeros2(nums2);
		duplicateZeros2(nums3);
	}

	public static void duplicateZeros2(int nums[]) {

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 0) {
				for (int j = nums.length - 1; j > i; j--) {
					nums[j] = nums[j - 1];
				}

				i++;
			}

		}
		System.out.println();
		Arrays.stream(nums).forEach(s -> System.out.print(s + " "));

	}
}
