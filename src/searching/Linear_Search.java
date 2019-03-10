package searching;

public class Linear_Search {

	/**
	 * @param arr
	 * @param searchNum
	 *            Time complexity is o(n) and space complexity is n
	 */
	public static void searchLinear(int arr[], int searchNum) {

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchNum) {
				flag = true;
				System.out.println("Number found at index " + i);
				break;
			}
		}

		if (!flag)
			System.out.println("Number not found  in array..");
	}

	public static void main(String str[]) {

		// int arr[] = { 5, 10, 12, 11, 16, 15, 25, 30 };
		// searchLinear(arr, 100);

		DataSet data = new DataSet(700000);

		// int search = 700;
		int search = 40000000;
		boolean isFound = false;
		for (int i = 0; i < data.getSize(); i++) {
			data.Numberoftry++;
			if (data.data[i] == search) {
				System.out.println("Number Found after : " + data.Numberoftry + " try ");
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println("Number not found ");
		}
	}

}
