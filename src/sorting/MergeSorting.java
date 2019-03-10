/**
 * 
 */
package sorting;

/**
 * @author anuj
 *
 */
public class MergeSorting {
	int[] array;
	int[] temparray;

	void prepareSort(int arr[]) {
		this.array = arr;
		this.temparray = new int[arr.length];
		doMergeSort(0, arr.length - 1);

	}

	private void doMergeSort(int lowerIndex, int highIndex) {

		if (lowerIndex < highIndex) {
			int middle = lowerIndex + (highIndex - lowerIndex) / 2;
			doMergeSort(lowerIndex, middle); // ex (0,5)
			doMergeSort(middle + 1, highIndex); // eg (6,10)
			MergePart(lowerIndex, middle, highIndex);
		}

	}

	private void MergePart(int lowerIndex, int middle, int highIndex) {
		// merge small problem and sort them

		for (int i = lowerIndex; i <= highIndex; i++)
			temparray[i] = array[i];

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= highIndex) {
			if (temparray[i] <= temparray[j]) {
				array[k] = temparray[i];
				i++;
			} else {
				array[k] = temparray[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			array[k] = temparray[i];
			i++;
			k++;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 67, 20, 40, 28, 80, 70 };
		System.out.println("Before Sorting...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		new MergeSorting().prepareSort(arr);
		System.out.println(" \n After sorting ...");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}

}
