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
 *         4:26:33 pm
 */
public class ParallalMergeSortApp {

	static Random random = new Random();

	public static void main(String[] args) {

		int numOfThread = Runtime.getRuntime().availableProcessors();
		System.out.println(numOfThread);

		int[] numbers = createRandomArray();

		MergeSort sq = new MergeSort(numbers);
		long startTime = System.currentTimeMillis();
		sq.mergeSort(0, numbers.length - 1);
		long endTime = System.currentTimeMillis();

		System.out.printf("Time taken for 100 000 000 elements sequential algorithm :%d", (endTime - startTime));
		;

		System.out.println("\n Parallel Algorithm Time ....");

		ParallelMergeSort parr = new ParallelMergeSort(numbers);
		startTime = System.currentTimeMillis();

		parr.parallelMergeSort(0, numbers.length - 1, numOfThread);
		endTime = System.currentTimeMillis();

		System.out.printf("Time taken for 100 000 000 elements Parallel algorithm :%d", (endTime - startTime));
		;

	}

	/**
	 * @return
	 */
	private static int[] createRandomArray() {
		int[] a = new int[1000000];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100000);

		}
		return a;
	}

}

class ParallelMergeSort {

	int nums[];
	int tempArray[];

	ParallelMergeSort(int nums[]) {
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

	public void parallelMergeSort(int low, int high, int numOfThread) {

		if (numOfThread <= 1) {
			mergeSort(low, high);
			return;
		}

		int midIndex = (low + high) / 2;

		Thread leftSorter = mergeSortParallel(low, midIndex, numOfThread);
		Thread rightSorter = mergeSortParallel(midIndex + 1, high, numOfThread);

		leftSorter.run();
		rightSorter.run();
		try {
			leftSorter.join();
			rightSorter.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		merge(low, midIndex, high);
	}

	/**
	 * @param low
	 * @param midIndex
	 * @param numOfThread
	 * @return
	 */
	private Thread mergeSortParallel(int low, int high, int numOfThread) {

		return new Thread() {
			@Override
			public void run() {
				parallelMergeSort(low, high, numOfThread / 2);
			}
		};

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