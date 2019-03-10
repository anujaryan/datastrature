package searching;

// time complexity of this algorithm is o(log n)

public class Binary_Search {

	public static void main(String[] args) {

		DataSet data = new DataSet(100);
		boolean isFound = false;
		int search = 3439;
		int low = 0;
		int mid = 0;
		int high = data.getSize() - 1;

		while (!isFound) {
			if (low > high) {
				System.out.println("Number not found ...");
				break;
			}
			mid = low + ((high - low) / 2);
			data.Numberoftry++;
			if (data.data[mid] == search) {
				System.out.println("Number found after " + data.Numberoftry + " try");
				break;
			}

			if (data.data[mid] < search)
				low = mid + 1;
			if (data.data[mid] > search)
				high = mid - 1;

		}

	}

}
