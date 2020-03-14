package elementofprogramming.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
11:28:44 am
 */
public class PivotSort {

	public static int[] pivotSort(int[] arr, int pivot) {

		int left = 0, right = arr.length;

		while (left < right) {

			if (arr[left] < pivot) {
				left++;
			} else {
				int temp = arr[right - 1];
				arr[right - 1] = arr[left];
				arr[left] = temp;
				right--;
			}

		}
		return arr;
	}

	@Test
	public void testPivotSort() {
		assertArrayEquals(new int[] { 0, 1, 2, 2 }, pivotSort(new int[] { 0, 2, 1, 2 }, 2));
	}

	@Test
	public void testPivotSort_sort() {
		assertArrayEquals(new int[] { 0, 2, 2, 2, 2, 2 }, pivotSort(new int[] { 0, 2, 2, 2, 2, 2 }, 2));
	}

	@Test
	public void testPivotSort_large() {
		assertArrayEquals(new int[] { 0, 1, 2, 2, 4, 5, 7, 7, 8, 10 },
				pivotSort(new int[] { 0, 1, 2, 2, 4, 7, 8, 10, 5, 7 }, 5));
	}
}
