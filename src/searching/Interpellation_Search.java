package searching;

public class Interpellation_Search {

	public static void main(String[] args) {

		DataSet data = new DataSet(100000);
		boolean isFound = false;
		int search = 99999;
		int low = 0;
		int mid = 0;
		int high = data.getSize() - 1;

		while (!isFound) {
			if (low > high) {
				System.out.println("Number not found ...");
				break;
			}
			mid = low + ((high - low) / (data.data[high] - data.data[low])) * (search - data.data[low]);
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
