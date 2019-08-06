/**
03-Aug-2019
Dell

 * 
 */
package multithreading;

import java.util.Random;

/**
 * @author Dell
 *
 *         3:53:31 pm
 */
public class SequentialMergeSortApp {

	public static void main(String[] args) {

		int nums[] = new int[30];

		Random random = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(1000) - 500;

		}

		MergeSort mergesort = new MergeSort(nums);
		mergesort.mergeSort(0, nums.length - 1);
		mergesort.showResult();

	}
}

class MergeSort {

	int nums[];
	int tempArray[];

	MergeSort(int nums[]) {
		this.nums = nums;
		this.tempArray = new int[nums.length];
	}

	/**
	 * 
	 */
	public void showResult() {

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " , ");

		}

	}

	public void mergeSort(int low, int high) {

		if (low >= high) {
			return;
		}

		int mid = (high + low) / 2;
		mergeSort(low, mid);
		mergeSort(mid + 1, high);

		merge(low, mid, high);

	}

	/**
	 * @param low
	 * @param mid
	 * @param high
	 */
	private void merge(int low, int mid, int high) {

		for (int i = 0; i <= high; i++) {
			tempArray[i] = nums[i];

		}

		int i = low;
		int j = mid + 1;
		int k = low;

		// left array

		while ((i <= mid) && (j <= high)) {

			if (tempArray[i] <= tempArray[j]) {
				nums[k] = tempArray[i];
				i++;
			} else {
				nums[k] = tempArray[j];
				j++;
			}
			k++;
		}

		// copy the left side array to target arrays
		while (i <= mid) {
			nums[k] = tempArray[i];
			k++;
			i++;
		}

		// copy the right side array to target arrays
		while (j <= high) {
			nums[k] = tempArray[j];
			j++;
			k++;
		}

	}

	public boolean isSorted(int nums[]) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > nums[i + 1]) {
				return false;
			}

		}
		return true;
	}

}