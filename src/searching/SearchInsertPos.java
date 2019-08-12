package searching;

public class SearchInsertPos {

	public static int getIndex(int nums[], int target) {

		int low = 0, high = nums.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static int getIndexFor(int nums[], int target) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] > target) {
				return index = i;

			} else if (nums[i] == target) {
				return index = i;
			}
		}
		if (index == 0)
			index = nums.length;
		return index;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 6, 50, 70, 80 };
		int target = 8;
		System.out.println(" Search Element found at index position : " + getIndex(arr, target));

	}
}
